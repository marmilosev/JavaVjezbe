/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvidencijaTrosak;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Unos {
        
    public static String unosString(String poruka){
        String unos = "";
        while(true){
            unos = JOptionPane.showInputDialog(poruka);
            if(unos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Neispravan podatak.");
                continue;
            }
            break;
        }
        return unos;
    }
    
    public static boolean unosBoolean(String poruka){
        while(true){
            try {
                return Boolean.parseBoolean(JOptionPane.showInputDialog(
                        poruka + " true ili false"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Neispravan Unos");
            }
        }
    }
    
    public static float unosFloat(String poruka){
        while(true){
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(
                        poruka + " . za decimalni dio"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Neispravan Unos");
            }
        }
    }
    
    
    
}
