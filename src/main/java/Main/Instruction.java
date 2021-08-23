package Main;

/**
 *
 * @author Angie Cooper
 */
public class Instruction {
    String operator = null;
    String register = null;
    int value = 0;
    
    public Instruction(String pOperator, String pRegister, int pValue){
        operator = pOperator;
        register = pRegister;
        value = pValue;
    }
    
    public Instruction(String pOperator, String pRegister){
        operator = pOperator;
        register = pRegister;
    }

    public String getOperator() {
        return operator;
    }

    public String getRegister() {
        return register;
    }

    public int getValue() {
        return value;
    }
    
}
