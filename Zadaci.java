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

// Za sve decimalne tipove podataka u entitetu prijatelj izračunava se prosjek na svim unesenim instancama entiteta muškarac

        double prosjek = 0;
        double eura = 0;
        double novcica = 0;
        int i = 0;
        for(Muskarac m : muskarci){
            
            if(m.getPrijatelj().getDecBroj() != 0){
                i++;
                eura += m.getEura();
                novcica += m.getNovcica();
            }
            prosjek = (eura + novcica)/i;
        }
        System.out.println("Prosjek: " + prosjek);


 //za unesena dva cijela broja
        //program ispisuje zbroj
        //svih parnih brojeva između unesenih vrijednosti
        //npr. uneseno 8 i 12 : 30
        // 13 i 5 : 36
        /*
    int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
    int j = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
        
    int min = i>j ? j : i;
    int max = i<j ? j : i;
    
    int suma = 0;
    for(int k=min;k<=max;k++){
        if(k%2 == 0){
        suma += k;
    }
    }
        System.out.println(suma);
        
    }
         */
        //Za definiran niz ocjena ispisati prosječnu ocjenu
        /*
        int[] niz = {1, 2, 5, 4, 2, 3, 4, 5, 1, 2};
        int suma = 0;
        int duljina = niz.length;
        float AS;
        for (int i : niz) {
            suma += i;
        }
        AS = suma / duljina;
        System.out.print(AS);
         */
        //formatirati ispis brojeva
        // jedinice ispod jedinica,
        //desetice ispod desetica,
        //stotica ispod stotica
        //brojevi se poravnaju desno
        /*
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                int multiple = i*j;
                //System.out.print(i*j + " ");
                System.out.printf("%4d", multiple);
            }
            System.out.println("");
        }
         */
        //10. Korisnik unosi cijele brojeve sve dok se ne unese broj -1. Program ispisuje sumu svih unesenih brojeva
        /*
        int i;
        int suma = 0;
        while(true){
            i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
            if(i == -1){
                break;
            }else{
                suma += i;
            }
        }
        System.out.println(suma);
         */
        //11. Korisnik unosi cijele brojeve sve dok se ne unese broj -1. Program ispisuje sumu svih parnih unesenih brojeva
        /*
        int i;
        int suma = 0;
        while(true){
            i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
            if(i == -1){
                break;
            }else{
                if(i % 2 == 0){
                suma += i;
            }
            }
        }
        System.out.println(suma);
         */
        //12. Za dani broj npr. 272723 provjerite da li je prosti (prim) broj
        int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
        boolean prim = false;
        
        for(int j = 2; j < i/2; j++){
            if (i % j == 0){
                System.out.println("NIJE PRIM BROJ");
                prim = true;
                break;
            }
        }
            if(prim == false){
                System.out.println("PRIM BROJ");
            }
        

