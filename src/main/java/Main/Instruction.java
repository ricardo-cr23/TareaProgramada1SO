package Main;

/**
 *
 * @author Angie Cooper
 */
public class Instruction {
    String operator = null;
    Register register = null;
    int value = 0;
    
    public Instruction(String pOperator, Register pRegister, int pValue){
        operator = pOperator;
        register = pRegister;
        value = pValue;
    }
    
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

    public int getValue() {
        return value;
    }
    
}
