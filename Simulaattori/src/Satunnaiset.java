
import java.util.*;

public class Satunnaiset {

    static Random random = new Random();

    public Satunnaiset() {
    }

    public void millonSatunnainen() {
        int luku = random.nextInt(30) + 1;
        if (luku > 20) {
            satunnainen();
        }
    }

    public void satunnainen() {
        int randomAika = random.nextInt(8) + 1;
        int valinta = random.nextInt(60) + 1;
        System.out.println(" ");
        System.out.println("Ny tapahtuu kummia.");
        if (valinta < 20) {
            Aika.vähennä(randomAika);
            System.out.println("Janne tuli kyselee tyhmii.. Aikaa meni " + randomAika + " minuuttia.");

        }

        if (valinta >= 20 && valinta <= 40) {
            Aika.vähennä(randomAika);
            System.out.println("Timo Soinin traumat takaa äänestyksen vilkkaan. Sanot Timo Soinille jotain tyhmää. Aikaa meni: " + randomAika + " minuuttia.");
        }
        if (valinta > 40) {
            System.out.println("Erä-Koira pyysi että sidot sen kengät, Nättii!");
            System.out.println("Aikaa meni " + randomAika + " minuuttia.");
            Aika.vähennä(randomAika);
        }
        System.out.println("Pommissa aikaa jäljellä: " + Aika.aika + " minuuttia.");
    }
}
