
public class Aika {

    //Paljon pommissa on aikaa
    public static int aika = 60;

    //Vähentää pommissa olevaa aikaa, jos aika menee nollaan tai alle niin se räjähtää ja ohjelma loppuu.
    public static boolean vähennä(int vähennä) {
        if (aika - vähennä <= 0) {
            aika = aika - vähennä;
            System.out.println("Aika loppui pommista ja se räjähti! KABOOOOM!");
            return false;
        } else {
            aika = aika - vähennä;
            return true;
        }
    }
}
