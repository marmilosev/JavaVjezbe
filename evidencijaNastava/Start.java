/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proba;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Start {
    
    List<Kolegij> kolegiji;

    public Start() {
        kolegiji = new ArrayList<>();
        
        do{
            unosKolegija();
        }while(!Unos.unosString("Unos k za prekid unosa kolegija").equals("k"));
        
    
        for(Kolegij k : kolegiji){
            int j = 0;
            for(Izostanak i : k.getIzostanci()){
                j++;
            }
            if(j>k.getBrojIzostanaka()){
                System.out.println(k.getNaziv() + ": " + j + "/" + k.getBrojIzostanaka());
            }else{
                System.out.println(k.getNaziv() + ": " + j + "/" + k.getBrojIzostanaka());
            }
            
        }
    }

    private void unosKolegija() {
        JOptionPane.showMessageDialog(null, "Unos novog kolegija");
        
        Kolegij k = new Kolegij();
        k.setSifra(Unos.unosInteger("Upiši šifru kolegija"));
        k.setNaziv(Unos.unosString("Upiši naziv kolegija"));
        k.setBrojIzostanaka(Unos.unosInteger("Upiši dozvoljeni broj izostanaka"));
        k.setIzostanci(unosIzostanaka());
        
        kolegiji.add(k);
    }

    private List<Izostanak> unosIzostanaka() {
        List<Izostanak> izostanci = new ArrayList<>();
        Izostanak i;
        do{
           i = unosIzostanak();
           izostanci.add(i);
        }while(!Unos.unosString("Unesi k za prekid unosa izostanaka").equals("k"));
        return izostanci;
    }

    private Izostanak unosIzostanak() {
        JOptionPane.showMessageDialog(null, "Unos izostanka");
        Izostanak i = new Izostanak();
        i.setDatum(Unos.unosDate("Upiši datum izostanka"));
        i.setRazlog(Unos.unosString("Upiši razlog izostanka"));
        
        return i;
    }
   
    public static void main(String[] args) {
        new Start();
    }
    
    
}
