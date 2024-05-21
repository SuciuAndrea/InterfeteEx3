import java.util.ArrayList;
import java.util.List;

public class Banca {
    private List<Client> clienti;
    private String codBanca;

    public Banca(String codBanca) {
        this.codBanca = codBanca;
        this.clienti = new ArrayList<>();
    }

    public void add(Client client) {
        clienti.add(client);
    }

    public void afisareClient(String nume) {
        for (Client client : clienti) {
            if (client.getNume().equals(nume)) {
                client.afisare();
                return;
            }
        }
        System.out.println("Clientul " + nume + " nu a fost gasit.");
    }
}

