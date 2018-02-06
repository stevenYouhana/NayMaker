/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naymaker;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Steven
 */
public class NayMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
           
        NayFrame frame = new NayFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final double WIDTH = screenSize.width/3.5;
        final double HEIGHT = screenSize.height/10;
        
        frame.setLocation((int)WIDTH, (int)HEIGHT);
        
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
