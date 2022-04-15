/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencijaPjesme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Marija
 */
public class Start {
    
    List<Evidencija> evidencije;
    
    public Start(){ 
        evidencije = new ArrayList<>();
        do{
            unosEvidencije();
        }while(!Unos.unosString("Unos X za prekid unos evidencije").trim().toLowerCase().equals("x"));
        
        ispisPjesama();
    }
    
    private void unosEvidencije() {
        JOptionPane.showMessageDialog(null, "Unos nove evidencije");
        Evidencija e = new Evidencija();
        e.setNaziv(Unos.unosString("Upiši naziv evidencije"));
        e.setOsoba(Unos.unosString("Upiši ime osobe koja sluša"));
        e.setPjesme(unosPjesama());
        
        evidencije.add(e);
    }
    
    private List<Pjesma> unosPjesama() {
        
        List<Pjesma> pjesme = new ArrayList<>();
        Pjesma p;
        boolean postoji;
        do{
            p = unosPjesme();
            postoji = false;
            for(Pjesma pj : pjesme){
                if(pj.getNaziv().equals(p.getNaziv()) && pj.getIzvodac().equals(p.getIzvodac())){
                    postoji = true;
                    break;
                }
            }
            if(!postoji){
                pjesme.add(p);
            }
        }while(!Unos.unosString("Unos X za prekid unosa pjesama na evidenciju").trim().toLowerCase().equals("x"));
        return pjesme;
    }
    
    private Pjesma unosPjesme() {
        JOptionPane.showMessageDialog(null, "Unos nove pjesme na evidenciji");
        
        Pjesma p = new Pjesma();
        p.setIzvodac(Unos.unosString("Upiši izvođača pjesme"));
        p.setNaziv(Unos.unosString("Upiši naziv pjesme"));
        
        return p;
    }
    
    private void ispisPjesama() {
        //jedinstvena pjesma po evidenciji
        Map<String,Integer> slusanePjesme = new HashMap<>();
        
        for(Evidencija e : evidencije){
            for(Pjesma p : e.getPjesme()){
                if(slusanePjesme.containsKey(p.getNaziv())){
                    slusanePjesme.put(p.getNaziv(), slusanePjesme.get(p.getNaziv()) + 1);
                }else{
                    slusanePjesme.put(p.getNaziv(), 1);
                }
            }
        }
        
        for(String s : slusanePjesme.keySet()){
            if(slusanePjesme.get(s)>=2){
                System.out.println(izvodac(s) + ": " + s + "(" + slusanePjesme.get(s) + ")");
            }
        }
    }
    
    private String izvodac(String pjesma) {
        for(Evidencija e : evidencije){
            for(Pjesma p : e.getPjesme()){
                if(p.getNaziv().equals(pjesma)){
                    return p.getIzvodac();
                }
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        new Start();
    }
















}
