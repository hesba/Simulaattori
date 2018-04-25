
public class Simulaattori {

    public static void main(String[] args) {

        StressiTaso st = new StressiTaso();
        Matka matka = new Matka();
        Satunnaiset sat = new Satunnaiset(st);
        TyöPaikka työpaikka = new TyöPaikka();
        Pommi pommi = new Pommi(st, matka, sat, työpaikka);

        //NY MENNÄÄÄÄ!
        pommi.letsPlay();
    }
}
