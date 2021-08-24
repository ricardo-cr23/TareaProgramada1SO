/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

public class OS {
    
    private CPU cpu;
    private Memory memory;
    private int memorySize = 100;
    
    public OS() {
        cpu = new CPU();
        memory = new Memory(memorySize);
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
    
    //Function to reset CPU components contents, to work on a new instruction set.
    public void resetComponents(){
        cpu = new CPU();
        memory = new Memory(memorySize);
    }
    
    public int startExecution(){
        //To reset internal values in CPU and Memory:
        this.resetComponents();
        
        FileReader fileReader = new FileReader();
        fileReader.loadFile();
        
        int memoryStartPosition = memory.memoryLoad(fileReader.getFileInstructions());
        
        return memoryStartPosition;
    }
    

    
    
}
