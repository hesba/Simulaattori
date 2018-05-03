
import java.util.*;

public class Satunnaiset {

    static Random random = new Random();
    private StressiTaso st;

    public Satunnaiset(StressiTaso st) {
        this.st = st;
    }
    
    public void millonSatunnainen() {
        int luku = random.nextInt(30)+1;
        if (luku>20) {
            satunnainen();
        }
    }
    
    public void satunnainen() {
        int randomAika = random.nextInt(4) + 1;
        int randomStressi = random.nextInt(4) + 1;
        int valinta = random.nextInt(3) + 1;
        if (valinta == 1) {
            System.out.println("Janne tuli kysyy taas tyhmii..");
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
        System.out.println("Stressitaso " + st.getTaso() + ". Pommissa aikaa jäljellä: " + Aika.aika + " minuuttia.");
    }
}
