import java.util.*;
public class Pommi {
    static Scanner lukija = new Scanner(System.in);
    private StressiTaso st;
    private Matka matka;
    private Satunnaiset sat;
    private TyöPaikka työpaikka;

    public Pommi(StressiTaso st, Matka matka, Satunnaiset sat, TyöPaikka työpaikka) {
        this.st = st;
        this.matka = matka;
        this.sat = sat;
        this.työpaikka = työpaikka;
    }

    public void letsPlay() {
        /*System.out.println("Pommissa aikaa jäljel: " + Aika.aika);
        st.lisääStressiä(2);
        st.lisääStressiä(3);
        matka.getkulunutAika();
        sat.satunnainen();
        työpaikka.lisääTyökalu();*/
        työpaikka.lisääTyökalu();
        kuori();
        irrotus();
        johto();
        
    }
    
    
    public void kuori() {
        System.out.println("Tehtävänä nostaa pommi pois kuoresta.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Kuoren saa auki helpoiten työkalulla: " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikeat työkalu: " + omaTyökalu);
        }
        else {
            System.out.println("Sul ei oo oikeet työkaluu! rip");
        }
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä " + Aika.aika + " minuuttia.");
    }

    public void irrotus() {
         System.out.println("Tehtävänä irrottaa pommi muista osista.");
         Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Irrotus onnistuu helpoiten " + omaTyökalu );
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikeat työkalu: " + omaTyökalu);
        }
        else {
            System.out.println("Sul ei oo oikeet työkaluu! rip");
        }
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä" + Aika.aika);
    }

    public void johto() {
         System.out.println("Tehtävänä katkaista johto irti kellosta. Tää onnistuu kynsillä.");
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä" + Aika.aika);
        System.out.println("Katkaise johdosita joko 1. Punainen, 2. Sininen tai 3. Musta ");
        int johto = lukija.nextInt();
        if (johto!=2) {
            meltDown();
        }
        else {
            System.out.println("Jei! Oikee johto.");
        }
    }

    public void räjähde() {
         System.out.println("Deaktivointi onnistuu helpoiten " + työkalu + " :lla");
        if (true) {
            System.out.println("Hyvä, oikeetyökalu mukana. Nyt varovasti!");
            System.out.println("Stressitaso " + stressitaso + " . Aikaa jäljellä" + aika);
    }

    public void meltDown() {
        System.out.println("BOOOM! Pommi räjähti!");
    }

}
