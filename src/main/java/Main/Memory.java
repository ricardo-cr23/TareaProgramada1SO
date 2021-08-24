/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Random;

public class Memory {
    private int memorySize = 0;
    
    private ArrayList<Instruction> normalMemory;
    private String[] binaryMemory;

    public Memory(int pMemorySize) {
        memorySize = pMemorySize;
        normalMemory = new ArrayList<>(memorySize);
        binaryMemory = new String[memorySize];
    }

    public ArrayList<Instruction> getNormalMemory() {
        return normalMemory;
    }

    public void setNormalMemory(ArrayList<Instruction> normalMemory) {
        this.normalMemory = normalMemory;
    }

    public String[] getBinaryMemory() {
        return binaryMemory;
    }

    public void setBinaryMemory(String[] binaryMemory) {
        this.binaryMemory = binaryMemory;
    }

    //Function to load instruction file into memory. 
    public int memoryLoad(ArrayList<Instruction> fileInstructions){
        //Fills ArrayList with blanks.
        for (int i = 0; i < memorySize; i++) {
            normalMemory.add(new Instruction("", new Register("", 0)));
        }
        
        for (int i = 0; i < memorySize; i++) {
            binaryMemory[i] = "";
        }
                
        int initialRandomMemoryPosition = randomInitialMemoryPosition(fileInstructions.size());
        int memoryPositionCounter = initialRandomMemoryPosition;
        
        for (Instruction instruction : fileInstructions) {
            normalMemory.set(memoryPositionCounter, instruction);
            binaryMemory[memoryPositionCounter] = instruction.transformInstructionToBinary();
            memoryPositionCounter ++;
        }
        
        return initialRandomMemoryPosition;
        
    }
    
    //Function to generate a random intial memory position. Takes in consideration reserved parts of the memory, and the length of the instruction file.  
    private int randomInitialMemoryPosition(int maxMemoryPosition){
        int minUsableMemoryPosition = 20;
        Random rn = new Random();
        int initialMemoryPosition = rn.nextInt((memorySize-maxMemoryPosition) - minUsableMemoryPosition + 1) + minUsableMemoryPosition;
        return initialMemoryPosition;
    }
    
   
        
}
