
public class Pommi {

    private StressiTaso st;
    private Matka matka;
    private Satunnaiset sat;

    public Pommi(StressiTaso st, Matka matka, Satunnaiset sat) {
        this.st = st;
        this.matka = matka;
        this.sat = sat;
    }

    public void letsPlay() {
        System.out.println("Pommissa aikaa jäljel: " + Aika.aika);
        st.lisääStressiä(2);
        st.lisääStressiä(3);
        matka.getkulunutAika();
        sat.satunnainen();
    }

    public void kuori() {

    }

    public void irrotus() {

    }

    public void johto() {

    }

    public void räjähde() {

    }

    public void gameOver() {
        System.out.println("BOOOM! Pommi räjähti!");
    }

}
