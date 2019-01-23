import java.util.Date;

public class Suoritus  {

    private String kurssiTunnus;
    private int arvosana;
    private Date suoritusPvm;

    public Suoritus() {
        super();
        kurssiTunnus = "";
        arvosana = 0;
        suoritusPvm = null;
    }

    public Suoritus(String kurssiTunnus, int arvosana, Date suoritusPvm) {
        this.kurssiTunnus = kurssiTunnus;
        this.arvosana = arvosana;
        this.suoritusPvm = suoritusPvm;
    }

    public String getKurssiTunnus() {
        return kurssiTunnus;
    }

    public int getArvosana() {
        return arvosana;
    }

    public Date getSuoritusPvm() {
        return suoritusPvm;
    }

    public void setKurssiTunnus(String kurssiTunnus) {
        this.kurssiTunnus = kurssiTunnus;
    }

    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }

    public void setSuoritusPvm(Date suoritusPvm) {
        this.suoritusPvm = suoritusPvm;
    }

    @Override
    public String toString() {
        if(!kurssiTunnus.equals(null))
        return '\n'+kurssiTunnus + " " + arvosana;
        else
            return "";
    }
}
