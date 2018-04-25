public class Simulaattori {
    public static void main(String[] args) {
        
        StressiTaso st = new StressiTaso();
        Matka matka = new Matka();
        Satunnaiset sat = new Satunnaiset(st);
        Pommi pommi = new Pommi(st, matka, sat);
        
        //NY MENNÄÄÄÄ!
        pommi.letsPlay();
}
}
