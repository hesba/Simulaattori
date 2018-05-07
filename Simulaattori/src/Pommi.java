
import java.util.*;

public class Pommi {

    static Scanner lukija = new Scanner(System.in);
    Random random = new Random();
    private Matka matka;
    private Satunnaiset sat;
    private TyöPaikka työpaikka;

    public Pommi(Matka matka, Satunnaiset sat, TyöPaikka työpaikka) {
        this.matka = matka;
        this.sat = sat;
        this.työpaikka = työpaikka;
    }
    
    //letsPlayssa tapahtuuu käytännössä koko pääohjelma.

    public void letsPlay() {
        System.out.println("Ohjelma simuloi tilanteen, jossa olet pomminpurkaja.");
        System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        System.out.println("Tehtävänäsi on valita mukaasi kolme (3) työkalua, jotka vaikuttavat purkuaikaan.");
        System.out.println("Saatat kohdata matkalla satunnaisia tapahtumia, jotka vievät aikaa.");
        System.out.println("ONNEA MATKAAN!");
        System.out.println(" ");
        työpaikka.lisääTyökalu();
        System.out.println(" ");
        System.out.println("Työkalut repussa ja saavuit pommipaikalle.");
        matka.getkulunutAika();
        while (true) {     //Jos aikaa jäljellä niin while looppi menee loppuun asti, muuten se menee Aika.aika vähennä metodiin jossa aika loppuu ja pommi räjähtää.
            kuori();
            if (Aika.aika <= 0) {
                break;
            }
            sat.millonSatunnainen();
            if (Aika.aika <= 0) {
                break;
            }
            irrotus();
            if (Aika.aika<=0) {
                break;
            }
            sat.millonSatunnainen();
            if (Aika.aika<=0) {
                break;
            }
            johto();
            if (Aika.aika <= 0) {
                break;
            }
            sat.millonSatunnainen();
            if (Aika.aika <= 0) {
                break;
            }
            räjähde();
            if (Aika.aika <= 0) {
                break;
            }
            if (Aika.aika>0) {
                System.out.println(" ");
                System.out.println("Pommin purkamiseen meni: " + (60-Aika.aika)+ " minuuttia.");
            }
            break;
        }
    }

    public void kuori() {
        System.out.println(" ");
        System.out.println("Vaihe 1.");
        System.out.println("Tehtävänä nostaa pommi pois kuoresta.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Kuoren saa auki helpoiten työkalulla: " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikea työkalu: " + omaTyökalu);
            System.out.println(omaTyökalu + " oli törkee hyvä. Aikaa meni vain 5 minuuttii!");
            Aika.vähennä(5);
        } else {
            System.out.println("Sul ei oo oikeet työkaluu!");
            System.out.println("Siul meni sörkkies 10 minuuttii.");
            Aika.vähennä(10);
        }
        if (Aika.aika>0) {
            System.out.println("Pommissa aikaa jäljellä: " + Aika.aika + " minuuttia.");
        }
    }

    public void irrotus() {
        System.out.println(" ");
        System.out.println("Vaihe 2.");
        System.out.println("Tehtävänä irrottaa pommi muista osista.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Irrotus onnistuu helpoiten työkalulla: " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikea työkalu: " + omaTyökalu);
            System.out.println("Aikaa meni 8 minuuttia.");
            Aika.vähennä(8);
        } else {
            System.out.println("Sinulta ei löytynyt oikeaa työkalua.");
            System.out.println("Aikaa meni 15 minuuttia.");
            Aika.vähennä(15);
        }
        if (Aika.aika>0) {
            System.out.println("Pommissa aikaa jäljellä: " + Aika.aika + " minuuttia.");
        }
    }

    public void johto() {
        System.out.println(" ");
        System.out.println("Vaihe 3.");
        System.out.println("Tehtävänä katkaista johto irti kellosta. Tää onnistuu kynsillä.");
        System.out.println("Aikaa jäljellä " + Aika.aika + " minuuttia.");
        System.out.println("Katkaiset johdoista joko 1. Punaisen, 2. Sinisen tai 3. Mustan. Good luck!");
        int johto = random.nextInt(3);
        
        if (johto == 2) {
            System.out.println("Valitsit sinisen johdon.. Väärä johto.");
            Aika.vähennä(60);
        } else {
            System.out.println("Jei! Oikee johto.");
            System.out.println("Aikaa meni 5 minuuttia.");
            Aika.vähennä(5);
        }
        if (Aika.aika>0) {
            System.out.println("Pommissa aikaa jäljellä: " + Aika.aika + " minuuttia.");
        }
    }

    public void räjähde() {
        System.out.println(" ");
        System.out.println("Vaihe 4. Viimeinen vaihe.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Jäljellä enään pommin deaktivointi, pystyt tähän!");
        System.out.println("Deaktivointi onnistuu helpoiten työkalulla: " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikea työkalu: " + omaTyökalu);
            System.out.println("Aikaa meni vain 10 minuuttia!");
            Aika.vähennä(10);
        } else {
            System.out.println("Sinulta ei löytynyt oikeaa työkalua.");
            System.out.println("Aikaa meni 20 minuuttia.");
            Aika.vähennä(20);
        }
        if (Aika.aika>0) {
            System.out.println("Pommin purku onnistui!");
        }
    }
}
