package Main;

/**
 *
 * @author Angie Cooper
 */
public class CPU {
    Register PC = null;
    Instruction IR = null;
    Register AC = null;
    
    Register AX = null;
    Register BX = null;
    Register CX = null;
    Register DX = null;
    
    public CPU(){
        
    }

    public Register getPC() {
        return PC;
    }

    public void setPC(Register PC) {
        this.PC = PC;
    }

    public Instruction getIR() {
        return IR;
    }

    public void setIR(Instruction IR) {
        this.IR = IR;
    }

    public Register getAC() {
        return AC;
    }

    public void setAC(Register AC) {
        this.AC = AC;
    }

    public Register getAX() {
        return AX;
    }
    
    public void setAX(Register AX) {
        this.AX = AX;
    }

    public Register getBX() {
        return BX;
    }

    public void setBX(Register BX) {
        this.BX = BX;
    }

    public Register getCX() {
        return CX;
    }

    public void setCX(Register CX) {
        this.CX = CX;
    }

    public Register getDX() {
        return DX;
    }

    public void setDX(Register DX) {
        this.DX = DX;
    }
    
    public Register getRegister(String registerName){
        return switch (registerName) {
            case "AC" -> AC;
            case "AX" -> AX;
            case "BX" -> BX;
            case "CX" -> CX;
            case "DX" -> DX;
            default -> null;
        };               
    }
     
    public void processInstruction(){
        switch (IR.getOperator()) {
            case "LOAD":
                AC.setValue(IR.getRegister().getValue());
                break;
            case "STORE":
                Register registerStore = getRegister(IR.getRegister().getName());
                registerStore.setValue(AC.getValue());
                break;
            case "MOV":
                Register registerMov = getRegister(IR.getRegister().getName());
                registerMov.setValue(IR.getRegister().getValue());
                break;
            case "ADD":
                int acADD = AC.getValue();
                AC.setValue(acADD+IR.getRegister().getValue());
                break;
            case "SUB":
                int acSUB = AC.getValue();
                AC.setValue(acSUB-IR.getRegister().getValue());
                break;
            default:
                break;
        }
    }
}
