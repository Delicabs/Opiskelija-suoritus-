import java.util.ArrayList;
import java.util.List;

public class Opiskelija {
    private String opiskelijanumero;
    private String nimi;
    private List<Suoritus> suoritukset = new ArrayList<Suoritus>();




    public void setSuoritukset(List<Suoritus> suoritukset) {
        this.suoritukset = suoritukset;
    }

    public List<Suoritus> getSuoritukset()
    {
        return suoritukset;
    }

    public void lisaa(Suoritus suoritus) {
        suoritukset.add(suoritus);
    }

    public Opiskelija() {
        opiskelijanumero = "";
        nimi = "";

    }

    public Opiskelija(String opiskelijanumero, String nimi) {
        this.opiskelijanumero = opiskelijanumero;
        this.nimi = nimi;

    }

    public String getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public String getNimi() {
        return nimi;
    }

    public void setOpiskelijanumero(String opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        String kokoTeksti;

              kokoTeksti =  "Opiskelijanumero: " + opiskelijanumero + '\n' +
                        "Nimi: " + nimi + '\n' +
                        "Suoritukset: ";

    for ( Suoritus suor : suoritukset)
       kokoTeksti += suor;


        return kokoTeksti;
    }
}
