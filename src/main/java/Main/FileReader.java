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
    
    public FileReader(){
        fileInstructions = null;
    }

    public ArrayList<Instruction> getFileInstructions() {
        return fileInstructions;
    }

    public void setFileInstructions(ArrayList<Instruction> fileInstructions) {
        this.fileInstructions = fileInstructions;
    }
    
    public void loadFile(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("ASM FILES", "asm");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(new JPanel());
        if (result == JFileChooser.APPROVE_OPTION) {
            // user selects a file
            File selectedFile = fileChooser.getSelectedFile();
            checkFile(selectedFile);
        }
        
    }
    
    public void checkFile(File file){
        List<String> operations = Arrays.asList(new String[]{"LOAD", "STORE", "MOV", "ADD", "SUB"});
        List<String> registers = Arrays.asList(new String[]{"AX", "BX", "CX", "DX"});
        ArrayList<Instruction> fileInstruct = new ArrayList<>();
        String errors = "ERROR: No se puede cargar el archivo. ";
        int errorFlag = 0;
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();        
                String[] instruction = data.split(" ");
                //Verify that the operation instruction is on the list of allowed operations
                if(operations.contains(instruction[0])){
                    if(instruction[0].equals("MOV")){
                        //If is MOV, verify that it has a comma
                        if(instruction[1].contains(",")){
                            instruction[1] = instruction[1].replace(",", "");
                            if(Integer.parseInt(instruction[2]) > 127 || Integer.parseInt(instruction[2]) < -128){
                                errors += "El numero debe ser de máximo 7 bits. ";
                                errorFlag = 1;
                            }
                        }
                        else{
                            errors += "La instrucción move requiere una coma. ";
                            errorFlag = 1;
                        }
                    }
                      //Verify that the register is on the list of allowed registers
                    if(registers.contains(instruction[1])){
                        if(errorFlag == 1){
                            JOptionPane.showMessageDialog(null, errors);
                        }
                        else{
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
                        errors += "El registro no existe. ";
                        errorFlag = 1;
                    }
                }
                else{
                    errors += "Hay una operación inválida. ";
                    errorFlag = 1;
                }
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            errors += "Problema al cargar el archivo. ";
            JOptionPane.showMessageDialog(null, errors); 
        }
        setFileInstructions(fileInstruct);
        //System.out.println(Arrays.asList(getFileInstructions().get(6).getValue()));
    }
}

