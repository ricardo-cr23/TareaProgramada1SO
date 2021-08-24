package Main;

/**
 *
 * @author Angie Cooper
 */
public class Instruction {
    String operator = null;
    Register register = null;
    
    public Instruction(String pOperator, Register pRegister){
        operator = pOperator;
        register = pRegister;
    }
    public String getOperator() {
        return operator;
    }

    public Register getRegister() {
        return register;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setRegister(Register register) {
        this.register = register;
    }
    
    public String transformInstructionToBinary(){
        String binaryInstruction = "";
        
        //Transforms operator to Binary
        switch(this.operator) {
            case "MOV":
                binaryInstruction += "0011 ";
                break;
            case "LOAD":
                binaryInstruction += "0001 ";
                break;
            case "STORE":
                binaryInstruction += "0010 ";
                break;
            case "SUB":
                binaryInstruction += "0100 ";
                break;
            case "ADD":
                binaryInstruction += "0101 ";
                break;
        }
        
        //Transforms register to Binary
        switch(this.register.getName()){
            case "AX":
                binaryInstruction += "0001 ";
                break;
            case "BX":
                binaryInstruction += "0010 ";
                break;
            case "CX":
                binaryInstruction += "0011 ";
                break;
            case "DX":
                binaryInstruction += "0100 ";
                break;
        }
        
        //Transforms decimal value to 8-bit binary number. 
        //Takes in consideration numbers with negative value (from -128 to 127)
        if (this.register.getValue() >= 0){
            String binaryString = Integer.toBinaryString(this.register.getValue());
            binaryInstruction += String.format("%8s", binaryString).replace(' ', '0');
        } else if (this.register.getValue() == -128) {
            String binaryString = Integer.toBinaryString(Math.abs(this.register.getValue()));
            binaryInstruction += String.format("%7s", binaryString).replace(' ', '0');
        } else {
            String binaryString = Integer.toBinaryString(Math.abs(this.register.getValue()));
            binaryInstruction += "1" + String.format("%7s", binaryString).replace(' ', '0');
        }
        
        return binaryInstruction;
    }
    
}
