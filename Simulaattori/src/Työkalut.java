public class Työkalut {
    private String nimi;

    public Työkalut(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }
    
    
}
