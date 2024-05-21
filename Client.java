import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private String adresa;
    private List<ContBancar> conturi;

    public Client(String nume, String adresa, List<ContBancar> conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = new ArrayList<>(conturi);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<ContBancar> getConturi() {
        return new ArrayList<>(conturi);
    }

    public void setConturi(List<ContBancar> conturi) {
        if (conturi.size() <= 5) {
            this.conturi = new ArrayList<>(conturi);
        }
    }

    public void afisare() {
        System.out.println("Nume: " + nume);
        System.out.println("Adresa: " + adresa);
        for (ContBancar cont : conturi) {
            System.out.println("Suma totala in cont " + cont.getNumarCont() + ": " + cont.getSumaTotala());
        }
    }
}
