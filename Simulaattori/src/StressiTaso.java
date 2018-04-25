
public class StressiTaso {

    private int taso = 0;

    public StressiTaso() {
    }

    public void lisääStressiä(int stressiTaso) {
        taso+=stressiTaso;
        System.out.println("Huoh.. Mikää ei onnaa.");
        if (taso <= 5) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(1);
            System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        }
        if (taso>5 && taso <= 10) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(2);
            System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        }
        if (taso>10 && taso <= 15) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(3);
            System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        }
        if (taso>15 && taso <= 20) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(4);
            System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        }
        if (taso>20 && taso<25) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(5);
            System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
        }
        if (taso >= 25) {
            System.out.println("Stressitasosi on: " + taso);
            Aika.vähennä(100);
        }
    }

    public void vähennäStressiä(int stressiTaso) {
        System.out.println("Huh, helpottaa! Ehkä mä jotai osaan.");
        taso-=stressiTaso;
        System.out.println("Pommin räjähtämiseen aikaa: " + Aika.aika + " minuuttia.");
    }
}
