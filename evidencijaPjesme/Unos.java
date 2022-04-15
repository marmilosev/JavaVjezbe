/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencijaPjesme;

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
                JOptionPane.showMessageDialog(null, "Neispravan unos");
                continue;
            }
            break;
        }
        return unos;
    }
    
}
