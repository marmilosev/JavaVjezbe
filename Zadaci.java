//  Za  sve datumske tipove podataka u entitetu svekar pronalazi se najmanje uneseni datum na svim unesenim instancama entiteta sestra

private void najmanjiDatum() {
        
        Date min;
        min = sestre.get(0).getOzenjen();
        
        for(Sestra s : sestre){
            if(s.getSvekar().getOzenjen().toString()!=""){
                if(s.getOzenjen().compareTo(min)<0){
                    min = s.getOzenjen();
                }
            }
        }
        System.out.println("Najmanji datum: " + Unos.ispisiDatum(min));
        
        
    }

//Za sve logičke tipove podataka u entitetu ostavljen zbraja se unos istinitih (true) vrijednosti na svim unesenim instancama entiteta zaručnik
        int suma = 0;
        for(Zarucnik z : zarucnici){
            if(z.getOstavljen().isAsocijalno()){
                suma += z.isEkstroventno() ? 1 : 0;
                suma += z.isIndiferentno() ? 1 : 0;
                suma += z.isIntrovertno() ? 1 : 0;
                
            }
            System.out.println(suma);
        }

//  Za sve cjelobrojne tipove podataka  u  entitetu  djevojka  izračunava  se  suma  na  svim  unesenim  instancama  entiteta snaša
        int suma = 0;
        for(Snasa s : snase){
            if(s.getDjevojka().getPrstena() != 0 && s.getDjevojka().getNausnica() != 0){
                suma += s.getOgrlica();
            }
        }
        System.out.println(suma);

