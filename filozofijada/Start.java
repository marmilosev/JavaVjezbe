/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.filozofijada;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Start {
    
    List<Prijava> prijave;

    public Start() {
        prijave = new ArrayList<>();
        
        do{
            unosPrijave();
        }while(!Unos.unosString("Unos n za prekid unosa prijava").equals("n"));
        
        ispisPrijava();
        ispisProsjek();
    }

    private void unosPrijave() {
        JOptionPane.showMessageDialog(null, "Unos nove prijave");
        Prijava p = new Prijava();
        p.setSifra(Unos.unosInteger("Upiši šifru prijave"));
        p.setDatumPrijave(Unos.unosDate("Upiši datum prijave"));
        p.setStudent(unosStudent());
        
        prijave.add(p);
    }

    private Student unosStudent() {
        JOptionPane.showMessageDialog(null, "Unos nove prijave");
        Student s = new Student();
        s.setJmbag(Unos.unosInteger("Unesi JMBAG"));
        s.setIme(Unos.unosString("Unesi ime"));
        s.setPrezime(Unos.unosString("Unesi prezime"));
        s.setProsjek(Unos.unosFloat("Unesi prosjek na dvije decimale"));
        
        return s;
    }

    private void ispisPrijava() {
        int i = 0;
        for(Prijava p : prijave){
            i++;
        }
        System.out.println("Ukupan broj prijava:" + i);
    }

    private void ispisProsjek() {
        float min, max;
        min = max = prijave.get(0).getStudent().getProsjek();
        
        for(Prijava p : prijave){
            if(p.getStudent().getProsjek()>max){
                max = p.getStudent().getProsjek();
            }
            if(p.getStudent().getProsjek()<min){
                min = p.getStudent().getProsjek();
            }
        }
        
        System.out.println("Najmanji prosjek: " + min);
        System.out.println("Najveći prosjek: " + max);
    }
    
   
    public static void main(String[] args) {
        new Start();
    }
    
}
