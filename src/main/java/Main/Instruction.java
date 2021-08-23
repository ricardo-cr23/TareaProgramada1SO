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
    
}
