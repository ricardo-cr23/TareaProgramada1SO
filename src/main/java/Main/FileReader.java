/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFileChooser;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Angie Cooper
 */
public class FileReader {
    String url;
    
    public FileReader(){
        url = null;
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
        String[] operations = {"LOAD", "STORE", "MOV", "ADD", "SUB"};
        System.out.println(file);
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


