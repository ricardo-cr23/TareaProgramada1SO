package Main;

/**
 *
 * @author Angie Cooper
 */
public class CPU {
    Register PC;
    Instruction IR;
    Register AC;
    Register AX;
    Register BX;
    Register CX;
    Register DX;
    
    public CPU(){
        PC = new Register("PC", 0);
        AC = new Register("AC", 0);
        AX = new Register("AX", 0);
        BX = new Register("BX", 0);
        CX = new Register("CX", 0);
        DX = new Register("DX", 0);
        
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
        if(registerName.equals("AC")) return this.AC;
        else if(registerName.equals("AX")) return this.AX;
        else if(registerName.equals("BX")) return this.BX;
        else if(registerName.equals("CX")) return this.CX;
        else if(registerName.equals("DX")) return this.DX;
        return null;             
    }
     
    public void processInstruction(){
        switch (IR.getOperator()) {
            case "LOAD":
                Register registerLoad = getRegister(IR.getRegister().getName());
                AC.setValue(registerLoad.getValue());
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
                Register registerAdd = getRegister(IR.getRegister().getName());
                AC.setValue(acADD+registerAdd.getValue());
                break;
            case "SUB":
                Register registerSub= getRegister(IR.getRegister().getName());
                int acSUB = AC.getValue();
                AC.setValue(acSUB-registerSub.getValue());
                break;
            default:
                break;
        }
    }
}
