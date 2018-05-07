
import java.util.*;
//Luokan nimi TyöPaikka, koska työkalut sijaitsevat siellä.
public class TyöPaikka {

    static Scanner lukija = new Scanner(System.in);
    Random random = new Random();
    private ArrayList<Työkalut> työkalut;
    private ArrayList<Työkalut> tyhjälista;

    public TyöPaikka() { //työkalut, jotka olemassa
        this.työkalut = new ArrayList();
        this.tyhjälista = new ArrayList();
        työkalut.add(new Työkalut("vasara"));
        työkalut.add(new Työkalut("purkka"));
        työkalut.add(new Työkalut("jesari"));
        työkalut.add(new Työkalut("pihdit"));
        työkalut.add(new Työkalut("linkkari"));
    }

    //Arpoo random työkalun (tätä käytetään silloin, kun halutaan tietää mikä työkalu on oikea missäkin vaiheessa pommia.
    public Työkalut arpooTyökalun() {
         return työkalut.get(random.nextInt(työkalut.size()));
}
    
    //Palauttaa käyttäjän valitsemat työkalut
    public String omatTyökalut() {
        return tyhjälista.toString();
    }
    
    
    //Kertoo mitä työkaluja on olemassa ja antaa käyttäjän valita haluamansa työkalut.
    public void lisääTyökalu() {
        System.out.println("Saatavilla olevat työkalut: " + työkalut.toString());
        while (tyhjälista.size() < 3) {
            boolean onkoLöytynyt = false;
            System.out.println("Syötä työkalu: ");
            String tk = lukija.nextLine().toLowerCase();
            for (Työkalut kalu:työkalut) {
                if (kalu.getNimi().equals(tk)) {
                    onkoLöytynyt=true;
                    if (!tyhjälista.toString().contains(tk)) {
                        tyhjälista.add(kalu);
                        System.out.println(tk+" lisätty reppuun. Repun sisältö: " +tyhjälista.toString());
                    }
                    else { //Tarkistaa onko työkalu jo mukana
                        System.out.println(tk+" on jo repussa.");
                    }
                }
                
            }
            if (onkoLöytynyt==false) { //Tarkistaa onko työkalu olemassa
                System.out.println(tk+" ei ole työkalu. Työkalut: " +työkalut.toString());
            }
        }
    }
}
