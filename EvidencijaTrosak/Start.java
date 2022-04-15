/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvidencijaTrosak;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marija
 */
public class Start {
    
    List<Projekt> projekti;

    public Start() {
        projekti = new ArrayList<>();
        
        do{
            unosProjekta();
        }while(!Unos.unosString("Gotov s unosom projekta (g)?").equals("g"));
        
        ispisSvihProjekata();
        prosjecnePlace();
    }

    private void unosProjekta() {
        Projekt p = new Projekt();
        p.setSifra(Unos.unosString("Upiši šifru projekta"));
        p.setNaziv(Unos.unosString("Upiši naziv projekta"));
        p.setZavrsen(Unos.unosBoolean("Da li je projekt gotov?"));
        p.setVoditelj(unosVoditelja());
        
        projekti.add(p);
    }

    private Voditelj unosVoditelja() {
        Voditelj v = new Voditelj();
        v.setIme(Unos.unosString("Unesi ime voditelja"));
        v.setPrezime(Unos.unosString("Unesi prezime voditelja"));
        v.setGodisnjaPlaca(Unos.unosFloat("Unesi godišnju plaću voditelja"));
        
        return v;
    }

    private void ispisSvihProjekata() {
        
        for(Projekt p : projekti){
            System.out.println(p.getNaziv() + ": " + (p.getVoditelj().getGodisnjaPlaca()/12));
        }
    }

    private void prosjecnePlace() {
        int i = 0;
        float suma = 0;
        for(Projekt p : projekti){
            if(p.isZavrsen()){
                i++;
                suma += (p.getVoditelj().getGodisnjaPlaca()/12);
            }
        }
        System.out.println("Prosjek mjesečnih plaća završenih projekata: " + suma/i);
        
    }
    
    public static void main(String[] args) {
        new Start();
    }
    
    
}
