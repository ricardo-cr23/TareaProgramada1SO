package Main.guielements;

import Main.FileReader;
import Main.Instruction;
import Main.OS;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class MainFrame extends javax.swing.JFrame {
    
    private OS os;
    boolean isProgramRunning;
    int currentMemoryPosition = 0;
    boolean successfulLoad = false;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        os = new OS();
        isProgramRunning = false;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jButtonRestart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelIR = new javax.swing.JLabel();
        jLabelAC = new javax.swing.JLabel();
        jLabelPC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelAX = new javax.swing.JLabel();
        jLabelBX = new javax.swing.JLabel();
        jLabelCX = new javax.swing.JLabel();
        jLabelDX = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNormal = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBinary = new javax.swing.JTable();
        jLabelIRBinary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Computer Simulation Program");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Load File");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jButtonNext.setText("Next Step");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonRestart.setText("Restart");
        jButtonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestartActionPerformed(evt);
            }
        });

        jLabel1.setText("Memory:");

        jLabel2.setText("0-19: Reserved");

        jLabelIR.setText("IR: Empty");

        jLabelAC.setText("AC: 0");

        jLabelPC.setText("PC: Empty");

        jLabel6.setText("Registers:");

        jLabelAX.setText("AX: 0");

        jLabelBX.setText("BX: 0");

        jLabelCX.setText("CX: 0");

        jLabelDX.setText("DX: 0");

        jLabel11.setText("Memory (Binary):");

        jLabel12.setText("0-19: Reserved");

        jTableNormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"20", "40", "60", "80"},
                {"21", "41", "61", "81"},
                {"22", "42", "62", "82"},
                {"23", "43", "63", "83"},
                {"24", "44", "64", "84"},
                {"25", "45", "65", "85"},
                {"26", "46", "66", "86"},
                {"27", "47", "67", "87"},
                {"28", "48", "68", "88"},
                {"29", "49", "69", "89"},
                {"30", "50", "70", "90"},
                {"31", "51", "71", "91"},
                {"32", "52", "72", "92"},
                {"33", "53", "73", "93"},
                {"34", "54", "74", "94"},
                {"35", "55", "75", "95"},
                {"36", "56", "76", "96"},
                {"37", "57", "77", "97"},
                {"38", "58", "78", "98"},
                {"39", "59", "79", "99"}
            },
            new String [] {
                "20-39", "40-59", "60-79", "80-99"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNormal);

        jTableBinary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"20", "40", "60", "80"},
                {"21", "41", "61", "81"},
                {"22", "42", "62", "82"},
                {"23", "43", "63", "83"},
                {"24", "44", "64", "84"},
                {"25", "45", "65", "85"},
                {"26", "46", "66", "86"},
                {"27", "47", "67", "87"},
                {"28", "48", "68", "88"},
                {"29", "49", "69", "89"},
                {"30", "50", "70", "90"},
                {"31", "51", "71", "91"},
                {"32", "52", "72", "92"},
                {"33", "53", "73", "93"},
                {"34", "54", "74", "94"},
                {"35", "55", "75", "95"},
                {"36", "56", "76", "96"},
                {"37", "57", "77", "97"},
                {"38", "58", "78", "98"},
                {"39", "59", "79", "99"}
            },
            new String [] {
                "20-39", "40-59", "60-79", "80-99"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableBinary);

        jLabelIRBinary.setText("IR(Binary): Empty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRestart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(393, 393, 393))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDX)
                            .addComponent(jLabelCX)
                            .addComponent(jLabelBX)
                            .addComponent(jLabelAX)
                            .addComponent(jLabel6)
                            .addComponent(jLabelPC)
                            .addComponent(jLabelAC)
                            .addComponent(jLabelIR)
                            .addComponent(jLabelIRBinary))
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelIRBinary)
                        .addGap(15, 15, 15)
                        .addComponent(jLabelAC)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPC)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAX)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBX)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCX)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDX))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonLoad)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonRestart)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //This is for the Restart button.
    private void jButtonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestartActionPerformed
        
        if (isProgramRunning) {
            String[] options = {"Yes", "No"};
            int option = JOptionPane.showOptionDialog(null, "Do you want to restart? Current progress will be lost.",
                "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
            switch (option) {
                case 0:
                    this.clearGUI();
                    this.currentMemoryPosition = 0;
                    successfulLoad = false;
                    isProgramRunning = false;
                    os.getFileReader().setSuccessfulLoad(false);
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        } else {
            this.clearGUI();
            this.currentMemoryPosition = 0;
            successfulLoad = false;
            isProgramRunning = false;
            os.getFileReader().setSuccessfulLoad(false);
        }
    }//GEN-LAST:event_jButtonRestartActionPerformed

    //This is for the Exit button.
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    //This is for the Load button.
    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        
        //Warning window
        if (isProgramRunning) {
            String[] options = {"Yes", "No"};
            int option = JOptionPane.showOptionDialog(null, "Do you want to load a new instruction file? Current progress will be lost.",
                "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
            switch (option) {
                case 0:
                    successfulLoad = false;
                    isProgramRunning = false;
                    os.getFileReader().setSuccessfulLoad(false);
                    successfulLoad = os.loadFile();
                    if (successfulLoad){
                        isProgramRunning = true;
                        currentMemoryPosition = os.startExecution();
                        this.updateMemoryGUI();
                        this.updateGUI();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "A file was not loaded. Please try again."); 
                    }
                case 1:
                    break;
                default:
                    break;
            }
        } else {
            successfulLoad = false;
            isProgramRunning = false;
            os.getFileReader().setSuccessfulLoad(false);
            successfulLoad = os.loadFile();
            if (successfulLoad){
                isProgramRunning = true;
                currentMemoryPosition = os.startExecution();
                this.updateMemoryGUI();
                this.updateGUI();
            } else {
                JOptionPane.showMessageDialog(null, "A file was not loaded. Please try again.");
            }
        }
        
        //this.isProgramRunning = true;
        //System.out.println("3 cambio a " + isProgramRunning);
    }//GEN-LAST:event_jButtonLoadActionPerformed

    //This is for the Next button.
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        this.processInstruction();
        
    }//GEN-LAST:event_jButtonNextActionPerformed

    //This function will process each instruction one at a time, when clicking Next button.
    //Ins: None.
    //Outs: none.
    //Restrictions: Memory must have been loaded at this time.
    private void processInstruction(){
        
        //This line loads the current instruction
        if (!isProgramRunning && !successfulLoad) {
            JOptionPane.showMessageDialog(null, "Please load an instruction file first.");
        } else if  ((os.getMemory().getNormalMemory().get(currentMemoryPosition).getOperator()).equals("") && isProgramRunning && successfulLoad) {
            JOptionPane.showMessageDialog(null, "You reached the end of the instruction list. Load a new file to start a new instruction iteration"); 
        } else {
            os.getCpu().setIR(os.getMemory().getNormalMemory().get(currentMemoryPosition));
            os.getCpu().processInstruction();
            this.updateGUI();
            currentMemoryPosition ++;
        }
    }
    
    //This function updates the GUI IR, PC, AC and Registers values.
    //Ins: None,
    //Outs: None. 
    //Restrictions: OS object must exist and have valid values.
    private void updateGUI(){
        os.getCpu().setIR(os.getMemory().getNormalMemory().get(currentMemoryPosition));
        this.jLabelIRBinary.setText("IR: " + os.getMemory().getBinaryMemory()[currentMemoryPosition]);
        
        if (os.getMemory().getNormalMemory().get(currentMemoryPosition).getOperator().equals("MOV")) {
            this.jLabelIR.setText("IR: " + os.getMemory().getNormalMemory().get(currentMemoryPosition).getOperator() 
                            + " "
                            + os.getMemory().getNormalMemory().get(currentMemoryPosition).getRegister().getName() 
                            + ", " 
                            + os.getMemory().getNormalMemory().get(currentMemoryPosition).getRegister().getValue()
            );
            } else {
            this.jLabelIR.setText("IR: " + os.getMemory().getNormalMemory().get(currentMemoryPosition).getOperator() 
                            + " "
                            + os.getMemory().getNormalMemory().get(currentMemoryPosition).getRegister().getName() 
            );
        }
        this.jLabelPC.setText("PC: " + currentMemoryPosition);
        this.jLabelAC.setText("AC: " + os.getCpu().getAC().getValue());
        
        //Registers
        this.jLabelAX.setText("AX: " + os.getCpu().getAX().getValue());
        this.jLabelBX.setText("BX: " + os.getCpu().getBX().getValue());
        this.jLabelCX.setText("CX: " + os.getCpu().getCX().getValue());
        this.jLabelDX.setText("DX: " + os.getCpu().getDX().getValue());
    }
    
    
    //This function updates the Memory arrays in the GUI.
    //Ins: None.
    //Outs: None.
    //Restrictions: OS object must exist, and have valid values.
    private void updateMemoryGUI(){
        int memoryIndex = 20;
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 20; i++) {
                if (os.getMemory().getNormalMemory().get(memoryIndex).getOperator().equals("MOV")) {
                    jTableNormal.setValueAt(memoryIndex 
                            + " " + os.getMemory().getNormalMemory().get(memoryIndex).getOperator() 
                            + " "
                            + os.getMemory().getNormalMemory().get(memoryIndex).getRegister().getName() 
                            + ", " 
                            + os.getMemory().getNormalMemory().get(memoryIndex).getRegister().getValue()
                            , i, j);
                    jTableBinary.setValueAt(memoryIndex + " " + os.getMemory().getBinaryMemory()[memoryIndex], i, j);
                    memoryIndex ++;
                } else {
                    jTableNormal.setValueAt(memoryIndex 
                            + " " + os.getMemory().getNormalMemory().get(memoryIndex).getOperator() 
                            + " " 
                            + os.getMemory().getNormalMemory().get(memoryIndex).getRegister().getName() 
                            , i, j);
                    jTableBinary.setValueAt(memoryIndex + " " +os.getMemory().getBinaryMemory()[memoryIndex], i, j);
                    memoryIndex ++;                    
                }
            }
        }
    }
    
    //This function clears the values in the GUI and the Operating System. 
    //Ins: None.
    //Outs: None.
    //Restrictions: OS object must exist. 
    private void clearGUI(){        
        jTableNormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"20", "40", "60", "80"},
                {"21", "41", "61", "81"},
                {"22", "42", "62", "82"},
                {"23", "43", "63", "83"},
                {"24", "44", "64", "84"},
                {"25", "45", "65", "85"},
                {"26", "46", "66", "86"},
                {"27", "47", "67", "87"},
                {"28", "48", "68", "88"},
                {"29", "49", "69", "89"},
                {"30", "50", "70", "90"},
                {"31", "51", "71", "91"},
                {"32", "52", "72", "92"},
                {"33", "53", "73", "93"},
                {"34", "54", "74", "94"},
                {"35", "55", "75", "95"},
                {"36", "56", "76", "96"},
                {"37", "57", "77", "97"},
                {"38", "58", "78", "98"},
                {"39", "59", "79", "99"}
            },
            new String [] {
                "20-39", "40-59", "60-79", "80-99"
            }));

        jTableBinary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"20", "40", "60", "80"},
                {"21", "41", "61", "81"},
                {"22", "42", "62", "82"},
                {"23", "43", "63", "83"},
                {"24", "44", "64", "84"},
                {"25", "45", "65", "85"},
                {"26", "46", "66", "86"},
                {"27", "47", "67", "87"},
                {"28", "48", "68", "88"},
                {"29", "49", "69", "89"},
                {"30", "50", "70", "90"},
                {"31", "51", "71", "91"},
                {"32", "52", "72", "92"},
                {"33", "53", "73", "93"},
                {"34", "54", "74", "94"},
                {"35", "55", "75", "95"},
                {"36", "56", "76", "96"},
                {"37", "57", "77", "97"},
                {"38", "58", "78", "98"},
                {"39", "59", "79", "99"}
            },
            new String [] {
                "20-39", "40-59", "60-79", "80-99"
            }));

        jLabelIR.setText("IR: Empty");
        jLabelIRBinary.setText("IR(Binary): Empty");
        jLabelAC.setText("AC: 0");
        jLabelPC.setText("PC: Empty");

       //Registers:
        jLabelAX.setText("AX: 0");
        jLabelBX.setText("BX: 0");
        jLabelCX.setText("CX: 0");
        jLabelDX.setText("DX: 0");

        os.resetComponents();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonRestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAC;
    private javax.swing.JLabel jLabelAX;
    private javax.swing.JLabel jLabelBX;
    private javax.swing.JLabel jLabelCX;
    private javax.swing.JLabel jLabelDX;
    private javax.swing.JLabel jLabelIR;
    private javax.swing.JLabel jLabelIRBinary;
    private javax.swing.JLabel jLabelPC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBinary;
    private javax.swing.JTable jTableNormal;
    // End of variables declaration//GEN-END:variables
}
