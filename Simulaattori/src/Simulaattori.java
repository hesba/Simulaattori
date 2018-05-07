
public class Simulaattori {

    public static void main(String[] args) {

        Matka matka = new Matka();
        Satunnaiset sat = new Satunnaiset();
        TyöPaikka työpaikka = new TyöPaikka();
        Pommi pommi = new Pommi(matka, sat, työpaikka);

        //NY MENNÄÄÄÄ!
        pommi.letsPlay();
    }
}
