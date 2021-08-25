package Main;

import javax.swing.JFileChooser;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Angie Cooper
 */
public class FileReader {
    ArrayList<Instruction> fileInstructions = new ArrayList<>();
    private boolean successfulLoad = false;
    
    public FileReader(){
        fileInstructions = null;
    }

    public ArrayList<Instruction> getFileInstructions() {
        return fileInstructions;
    }

    public boolean isSuccessfulLoad() {
        return successfulLoad;
    }

    public void setSuccessfulLoad(boolean successfulLoad) {
        this.successfulLoad = successfulLoad;
    }


    public void setFileInstructions(ArrayList<Instruction> fileInstructions) {
        this.fileInstructions = fileInstructions;
    }
    //Entry: Empty
    //Opens a window to choose a file with an asm extension. If the file loads 
    //successfully the file is evaluated
    public boolean loadFile(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("ASM FILES", "asm");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(new JPanel());
        if (result == JFileChooser.APPROVE_OPTION) {
            // user selects a file
            File selectedFile = fileChooser.getSelectedFile();
            return checkFile(selectedFile);
        }
        return false;
        
    }
    
    public boolean checkFile(File file){
        List<String> operations = Arrays.asList(new String[]{"LOAD", "STORE", "MOV", "ADD", "SUB"});
        List<String> registers = Arrays.asList(new String[]{"AX", "BX", "CX", "DX"});
        ArrayList<Instruction> fileInstruct = new ArrayList<>();
        String errors = "ERROR: Unable to upload file. ";
        int rowCounter = 1;
        int errorFlag = 0;
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();        
                String[] instruction = data.split(" ");
                //Verify that the operation instruction is on the list of allowed operations
                if(operations.contains(instruction[0])){
                    if((instruction[0].equals("MOV") && instruction.length == 3) || (!(instruction[0].equals("MOV")) && instruction.length == 2)){
                        if(instruction[0].equals("MOV")){
                            //If is MOV, verify that it has a comma
                            if(instruction[1].contains(",")){
                                instruction[1] = instruction[1].replace(",", "");
                                if(Integer.parseInt(instruction[2]) > 127 || Integer.parseInt(instruction[2]) < -128){
                                    errors += "Row "+rowCounter +". The number must be a maximum of 7 bits. ";
                                    errorFlag = 1;
                                }
                            }
                            else{
                                errors += "Row "+rowCounter +". The move statement requires a comma. ";
                                errorFlag = 1;
                            }
                        }
                          //Verify that the register is on the list of allowed registers
                        if(registers.contains(instruction[1])){
                            if(errorFlag != 1){
                                if(instruction[0].equals("MOV")){
                                    Register register = new Register(instruction[1], Integer.parseInt(instruction[2]));
                                    Instruction typeInstruction = new Instruction(instruction[0], register);
                                    fileInstruct.add(typeInstruction);
                                }
                                else{
                                    Register register = new Register(instruction[1], 0);
                                    Instruction typeInstruction = new Instruction(instruction[0], register);
                                    fileInstruct.add(typeInstruction);
                                }
                            }
                        }
                        else{
                            errors += "Row "+rowCounter + ". The register does not exist. ";
                            errorFlag = 1;
                        }
                    }
                    else {
                        errors += "Row "+rowCounter + ". The instruction is invalid. ";
                        errorFlag = 1;
                    }
                }
                else{
                    errors += "Row "+rowCounter +". There is an invalid operation. ";
                    errorFlag = 1;
                }
            rowCounter +=1;
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            errors += "Problem uploading file. ";
            JOptionPane.showMessageDialog(null, errors); 
        }
        if(errorFlag == 1){
            JOptionPane.showMessageDialog(null, errors);
            return false;
        }
        else{
            setFileInstructions(fileInstruct);
            this.successfulLoad = true;
            return true;
        }
    }
}

