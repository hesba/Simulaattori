
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

        System.out.println("Olet pomminpurkaja. Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        System.out.println("Tehtävänäsi on valita mukaasi kolme (3) työkalua, jotka vaikuttavat purkuaikaan.");
        System.out.println("Saatat kohdata matkalla satunnaisia tapahtumia, jotka vievät aikaa.");
        System.out.println("ONNEA MATKAAN!");
        työpaikka.lisääTyökalu();
        System.out.println("Työkalut repussa ja saavuit pommipaikalle.");
        matka.getkulunutAika();
        while (true) {
            kuori();
            if (Aika.aika <= 0) {
                break;
            }
            System.out.println(" ");
            sat.millonSatunnainen();
            if (Aika.aika <= 0) {
                break;
            }
            System.out.println(" ");
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
            break;
        }
    }

    public void kuori() {
        System.out.println("Tehtävänä nostaa pommi pois kuoresta.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Kuoren saa auki helpoiten työkalulla: " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikeat työkalu: " + omaTyökalu);
            Aika.vähennä(1);
            System.out.println(omaTyökalu + " oli törkee hyvä. Aikaa meni vain minuutti!");
        } else {
            System.out.println("Sul ei oo oikeet työkaluu!");
            Aika.vähennä(5);
            System.out.println("Siul meni sörkkies 5 minuuttii.");
        }
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä " + Aika.aika + " minuuttia.");
    }

    public void irrotus() {
        System.out.println("Tehtävänä irrottaa pommi muista osista.");
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Irrotus onnistuu helpoiten " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikeat työkalu: " + omaTyökalu);
        } else {
            System.out.println("Sul ei oo oikeet työkaluu! rip");
        }
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä " + Aika.aika + " minuuttia.");
    }

    public void johto() {
        System.out.println("Tehtävänä katkaista johto irti kellosta. Tää onnistuu kynsillä.");
        System.out.println("Stressitaso " + st.getTaso() + " . Aikaa jäljellä " + Aika.aika + " minuuttia.");
        System.out.println("Katkaise johdoista joko 1. Punainen, 2. Sininen tai 3. Musta ");
        int johto = lukija.nextInt();
        if (johto != 2) {
            Aika.vähennä(30);
        } else {
            System.out.println("Jei! Oikee johto.");
        }
    }

    public void räjähde() {
        Työkalut omaTyökalu = työpaikka.arpooTyökalun();
        System.out.println("Irrotus onnistuu helpoiten " + omaTyökalu);
        if (työpaikka.omatTyökalut().contains(omaTyökalu.toString())) {
            System.out.println("Sinulta löytyi oikeat työkalu: " + omaTyökalu);
        } else {
            System.out.println("Sul ei oo oikeet työkaluu! rip");
        }
    }
}
