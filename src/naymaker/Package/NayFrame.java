/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naymaker;

import java.awt.GraphicsConfiguration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import javax.swing.JOptionPane;
import java.lang.*;
import java.util.logging.Formatter;
import javax.swing.ImageIcon;

/**
 *
 * @author Steven
 */
public class NayFrame extends javax.swing.JFrame {
    
    

    /**
     * Creates new form NayFrame
     */
    public NayFrame() {

        initComponents();
        Visuals opening = new Visuals();
    
     
        this.setIconImage(new ImageIcon("/NayIcon.JPG").getImage());
        
        this.setTitle("Nay Calculator");
        
        this.setResizable(false);
        this.setSize(500,215);
        Visuals visuals;
        visuals = new Visuals(cboSoundSpeed,chkNewSpeed);   //constructor 1 for soundSpeed cBox
        visuals.populateSoS();
        visuals.newSpeed(lblSelectSpeed, txtSoundSpeed);
        visuals = new Visuals(cboScale);    //constructor 2 for scale method
        visuals.populateTuning();
        this.txtOutput.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgMessage = new javax.swing.JOptionPane();
        flChooser = new javax.swing.JFileChooser();
        panOutput = new javax.swing.JPanel();
        txtOutput = new javax.swing.JTextArea();
        panSelect = new javax.swing.JPanel();
        cboSoundSpeed = new javax.swing.JComboBox<>();
        txtSoundSpeed = new javax.swing.JTextField();
        cboScale = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chkNewSpeed = new javax.swing.JCheckBox();
        lblSelectSpeed = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panOutput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtOutput.setColumns(20);
        txtOutput.setRows(5);

        javax.swing.GroupLayout panOutputLayout = new javax.swing.GroupLayout(panOutput);
        panOutput.setLayout(panOutputLayout);
        panOutputLayout.setHorizontalGroup(
            panOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panOutputLayout.setVerticalGroup(
            panOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        jLabel3.setText("Select Nay scale");

        chkNewSpeed.setText("Enter Speed of sound");
        chkNewSpeed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkNewSpeedItemStateChanged(evt);
            }
        });

        lblSelectSpeed.setText("Select speed of sound to work with");

        jLabel1.setText("m/s");

        btnCalculate.setText("Display Result");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel2.setText("m/s");

        javax.swing.GroupLayout panSelectLayout = new javax.swing.GroupLayout(panSelect);
        panSelect.setLayout(panSelectLayout);
        panSelectLayout.setHorizontalGroup(
            panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSelectLayout.createSequentialGroup()
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSelectLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectSpeed)
                            .addComponent(chkNewSpeed))
                        .addGap(39, 39, 39))
                    .addGroup(panSelectLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSoundSpeed, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboScale, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                        .addComponent(cboSoundSpeed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)))
        );
        panSelectLayout.setVerticalGroup(
            panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectSpeed)
                    .addComponent(cboSoundSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoundSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNewSpeed)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnCalculate))
        );

        btnSave.setText("Save records");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addComponent(panOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setMessage(JOptionPane pane){
        pane.showMessageDialog(this,"message","title",JOptionPane.ERROR_MESSAGE);
        msgMessage = pane;
    }
    private void chkNewSpeedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkNewSpeedItemStateChanged
        Visuals visuals = new Visuals(cboSoundSpeed,chkNewSpeed);
        visuals.newSpeed(lblSelectSpeed, txtSoundSpeed);

    }//GEN-LAST:event_chkNewSpeedItemStateChanged

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double speedOfSound;
        String scale = cboScale.getItemAt(cboScale.getSelectedIndex());
        try{
            if(chkNewSpeed.isSelected()){
                speedOfSound = Double.parseDouble(txtSoundSpeed.getText());
                if(txtSoundSpeed.getText().contains("f")){
                    msgMessage.showMessageDialog(this,"Please enter a number value","Number Format Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else if(txtSoundSpeed.getText().startsWith("-")){
                    this.setSize(500,215);
                    msgMessage.showMessageDialog(this,"Please enter a positive number","Error",JOptionPane.ERROR_MESSAGE);
                    txtSoundSpeed.setText("");
                    return;
                }
            }
            else{
                int index = cboSoundSpeed.getSelectedIndex();
                String speedBox = String.valueOf(cboSoundSpeed.getSelectedItem());  //casting combobox
                speedOfSound = Double.parseDouble(speedBox);
            }
            Calculations calculate = new Calculations(speedOfSound, scale, txtOutput);
            calculate.workKeyPositions();
            this.setSize(500,594);  //expand window
        }
        catch(NumberFormatException nfe){
            this.setSize(500,215);
            msgMessage.showMessageDialog(this,"Please enter a number value"+"\n"+nfe.toString(),"Number Format Error",
                    JOptionPane.ERROR_MESSAGE);
            txtSoundSpeed.setText("");
        }
        catch(Exception e){
            this.setSize(500,215);
            msgMessage.showMessageDialog(this,e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            txtSoundSpeed.setText("");
        }
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        FileOutputStream write = null;
        int count = 0;
        int retValue = flChooser.showSaveDialog(this);
        
        if(retValue == javax.swing.JFileChooser.APPROVE_OPTION){
            try{
               File file = new File(flChooser.getSelectedFile().getPath());
               write = new FileOutputStream(file);
               for (char c : txtOutput.getText().toCharArray()){
                   write.write(c);
               }
               write.flush();
               write.close();
            }
            catch(IOException ioe){
                msgMessage.showMessageDialog(this,ioe.toString(),"Saving error",JOptionPane.ERROR_MESSAGE);
            }
        }
            
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NayFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboScale;
    private javax.swing.JComboBox<String> cboSoundSpeed;
    private javax.swing.JCheckBox chkNewSpeed;
    private javax.swing.JFileChooser flChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSelectSpeed;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JPanel panOutput;
    private javax.swing.JPanel panSelect;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtSoundSpeed;
    // End of variables declaration//GEN-END:variables
}
