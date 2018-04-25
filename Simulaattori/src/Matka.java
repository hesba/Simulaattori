
import java.util.Random;

public class Matka {
    
    private int kulunutAika;
    
    public Matka() {
    }
    
    Random rand = new Random();

    public int getkulunutAika() {
        kulunutAika=rand.nextInt(20) + 5;
        Aika.vähennä(kulunutAika);
        System.out.println("Matkaan kului: " + kulunutAika + " minuuttia. Pommissa aikaa vielä jäljellä: " + Aika.aika + " minuuttia.");
        return kulunutAika;

    }
}
