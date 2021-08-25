package Main;

public class OS {
    
    private CPU cpu;
    private Memory memory;
    private int memorySize = 100;
    private FileReader fileReader = new FileReader();
    private boolean successfulLoad = false;
    
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

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public boolean isSuccessfulLoad() {
        return successfulLoad;
    }

    public void setSuccessfulLoad(boolean successfulLoad) {
        this.successfulLoad = successfulLoad;
    }
    
    //Function to reset CPU components contents, to work on a new instruction set.
    public void resetComponents(){
        cpu = new CPU();
        memory = new Memory(memorySize);
    }
    
    public boolean loadFile(){
        //To reset internal values in CPU and Memory:
        this.resetComponents();
        fileReader.loadFile();
        
        return fileReader.isSuccessfulLoad();
    }
    
    //Function to start OS execution, by resetting values in computer components and loading a new instruction set in Memory. 
    public int startExecution(){

        int memoryStartPosition = memory.memoryLoad(fileReader.getFileInstructions());
        return memoryStartPosition;

    }
    

    
    
}
