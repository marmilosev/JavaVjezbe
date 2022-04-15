/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.filozofijada;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Unos {
    public static int unosInteger(String poruka){
        while(true){
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan podatak.");
            }
        }
    }
    
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
    
    public static Date unosDate(String poruka){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
        while(true){
            try {
                return sdf.parse(JOptionPane.showInputDialog(poruka + " u formatu dd.MM.yyyy."));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
            }
        }
    }
    
    public static String ispisiDatum(Date poruka){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        return sdf.format(poruka);
    }
    
    
    
    
    
    
}
