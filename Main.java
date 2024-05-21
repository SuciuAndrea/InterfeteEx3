import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ContBancar cont1 = new ContLei("RO001", 1000);
        ContBancar cont2 = new ContEuro("RO002", 700);

        Client client1 = new Client("Ion Popescu", "Str. Libertatii, nr. 10", Arrays.asList(cont1, cont2));
        
        Banca banca = new Banca("BNR001");
        banca.add(client1);

        banca.afisareClient("Ion Popescu");

       
        ContLei cont3 = new ContLei("RO003", 500);
        client1.getConturi().add(cont3);

        System.out.println("Inainte de transfer:");
        banca.afisareClient("Ion Popescu");

        ((ContLei)cont1).transfer(cont3, 200);

        System.out.println("Dupa transfer:");
        banca.afisareClient("Ion Popescu");
    }
}

