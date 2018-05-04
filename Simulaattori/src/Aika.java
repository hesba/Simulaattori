
public class Aika {

    public static int aika = 30;

    public static boolean vähennä(int vähennä) {
        if (aika - vähennä <= 0) {
            aika = aika - vähennä;
            System.out.println("KABOOOOM!");
            return false;
        } else {
            aika = aika - vähennä;
            return true;
        }
    }
}
