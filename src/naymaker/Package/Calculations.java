/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naymaker;

import java.net.MalformedURLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Steven
 */
public class Calculations {
    double speedOfSound;
    double firstOT; //first overtone frequency
    String scale = null;
    double lengthOfNay;
    double[] distanceRatio = {85.8, 81.3, 77.1, 69.6, 65.4, 61.2};  //percentages
    JTextArea output = null;
    String result = "";
    JOptionPane message = null;

    public Calculations(double speedOfSound, String scale, JTextArea output){
        this.speedOfSound = speedOfSound;
        this.scale = scale;
        this.output = output;
        this.message = message;
        
        setFrequency();
        workNayLength();  
        roundLength();
        
    }
    
    public void setFrequency(){
        switch(scale){
            case "Bayat B": firstOT = 440;
            result += "Bayat B:"+"\n";
            break;
            case "Bayat C": firstOT = 466;
            result += "Bayat C:"+"\n";
            break;
            case "Bayat D": firstOT = 523;
            result += "Bayat D:"+"\n";
            break;
            case "Bayat E": firstOT = 587;
            result += "Bayat E:"+"\n";
            break;
        }
    }
    public void roundLength(){
        DecimalFormat df = new DecimalFormat("#.##");
        try{
            double roundedLength = Double.parseDouble(df.format(lengthOfNay));
            lengthOfNay = roundedLength*1000;   //to mm
        }
        catch(NumberFormatException nfe){
            nfe.getStackTrace();
        }
    
    }
    public void workNayLength(){
        //wavelength = v/f
        try{
            lengthOfNay = speedOfSound/firstOT;
            result += "Selected SOS: "+speedOfSound+" ms"+"\n\n";
            result += "Lenght of Nay: "+ Math.round(lengthOfNay*1000)+" mm"+"\n\n";
        }
        catch(Exception nfe){
            nfe.getStackTrace();
        }
    }
    
    public void workKeyPositions() throws MalformedURLException{
        try{
            double[] keyPosition = new double[6];   //nay holes distances 
            for(int i = 0; i<6; i++){
                keyPosition[i]=(distanceRatio[i]/100*lengthOfNay);  //working positions
            }
            for(int i =0; i<6; i++){    //rounding
                String stringed = String.valueOf(keyPosition[i]);
                if(stringed.contains(".")){
                    String round = stringed.substring(0, stringed.indexOf(".")+2);
                    keyPosition[i] = Double.parseDouble(round);
                }
            }
            double key7 = keyPosition[5]-(keyPosition[2] - keyPosition[3]);
            // rounding key7
            String key7String = String.valueOf(key7);   
            if(key7String.contains(".")){   
                key7String = key7String.substring(0, key7String.indexOf(".")+2);
            }
            for(int i=0; i<6; i++){
                result += "Key "+(i+1)+": "+keyPosition[i]+"\n\n";   
            }
            result += "key 7: "+key7String+" (back key)"+"\n\n";
            result += "Measure from, mouth piece to each key";
            output.setText(result);    
        }
    
        catch(NumberFormatException nfe){
            nfe.getStackTrace();
        }
    }
}
