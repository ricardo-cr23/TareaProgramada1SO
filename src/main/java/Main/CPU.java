/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     
    public void processInstruction(){
        if(IR.getOperator().equals("LOAD")){
            
        }
        else if(IR.getOperator().equals("STORE")){
            
        }
        else if(IR.getOperator().equals("MOV")){
            
        }
        else if(IR.getOperator().equals("ADD")){
            
        }
        //SUB
        else{
            
        }
    }
}
