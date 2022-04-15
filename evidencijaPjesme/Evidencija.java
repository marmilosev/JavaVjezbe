/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidencijaPjesme;

import java.util.List;

/**
 *
 * @author Marija
 */
public class Evidencija {
    
    private String naziv;
    private String osoba;
    private List<Pjesma> pjesme;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public List<Pjesma> getPjesme() {
        return pjesme;
    }

    public void setPjesme(List<Pjesma> pjesme) {
        this.pjesme = pjesme;
    }
    
    
    
    
    
}
