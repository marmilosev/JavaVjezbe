package Proba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
            }
        }
    }
    
    public static String unosString(String poruka){
        String unos = "";
        while(true){
            unos = JOptionPane.showInputDialog(poruka);
            if(unos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
                continue;
            }
            break;
        }
        return unos;
      }
    
    public static float unosFloat(String poruka){
        while(true){
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(poruka + " (. za decimalni broj)"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
            }
        }
    }
    
    public static Date unosDate(String poruka){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
        while(true){
            try {
                return sdf.parse(JOptionPane.showInputDialog(poruka + " u dd.MM.yyyy. formatu"));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
            }
        }
    }
  
    static String ispisiDatum(Date s){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy.");
        
        return sdf.format(s);
    }
    
    public static boolean unosBoolean(String poruka){
        while(true){
            try {
                return Boolean.parseBoolean(JOptionPane.showInputDialog(poruka + " (true/false)"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Neispravan podatak");
            }
        }
    }
    
    public static double unosDouble(String poruka){
        while(true){
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(
                        poruka + " . za decimalni dio"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Neispravan Unos");
            }
        }
    }
}
