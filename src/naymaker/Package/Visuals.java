package naymaker;
import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author Steven
 */
public class Visuals {
    
    private JComboBox sos = null;
    private JCheckBox newSpeed = null;
    private JComboBox scale;
    
    
    public Visuals(JComboBox sos, JCheckBox newSpeed){
        this.newSpeed = newSpeed;
        this.sos = sos; 
    }
    public Visuals(JComboBox scale){
        this.scale = scale;
    }
    public Visuals(){
        
    }
    
    public void populateSoS(){
        sos.addItem(304.7);
        sos.addItem(343.0);
    }
    public void openImage(){

    }
    public void newSpeed(JLabel txt, JTextField txtSpeed){
        txtSpeed.setText("");
        if(newSpeed.isSelected()){
            sos.setEnabled(false);
            txtSpeed.setBackground(Color.white);
            txt.setText("Enter speed of sound to work with");
            txtSpeed.setEnabled(true);
        }
        else{
            sos.setEnabled(true);
            txtSpeed.setEnabled(false);
            txtSpeed.setBackground(Color.lightGray);
            txt.setText("Select speed of sound to work with");
        }
    } 
    public void populateTuning(){
        javax.swing.DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel();
        model.insertElementAt("Bayat B", 0);
        model.insertElementAt("Bayat C", 1);
        model.insertElementAt("Bayat D", 2);
        model.insertElementAt("Bayat E", 3);
        
        scale.setModel(model);
        scale.setSelectedIndex(0);
    }
}
