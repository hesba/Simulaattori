
import java.util.*;

public class Satunnaiset {

    static Random random = new Random();
    private StressiTaso st;

    public Satunnaiset(StressiTaso st) {
        this.st = st;
    }
    
    public void satunnainen() {
        int randomAika = random.nextInt(4) + 1;
        int randomStressi = random.nextInt(4) + 1;
        int valinta = random.nextInt(3) + 1;
        if (valinta == 1) {
            System.out.println("Kierrät ja yrität ottaa Alepa-fillarin, pyöriä EI OLE, jatkat kävelyä.");
            st.lisääStressiä(randomStressi);
        }

        if (valinta == 2) {
            System.out.println("Timo Soini takaa äännestyksen vilkkaan. Sanot Timo Soinille jotain tyhmää.");
            st.vähennäStressiä(randomStressi);
        } else {
            System.out.println("Erä-Koira pyysi että sidot sen kengät, Iha vitu jepa.");
            System.out.println("Aikaa meni " + randomAika + " minuuttia.");
            Aika.vähennä(randomAika);
        }
    }
}
