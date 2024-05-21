public class ContLei extends ContBancar {
    public ContLei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return suma;
    }

    public void transfer(ContBancar contDestinatie, float suma) {
        if (contDestinatie instanceof ContLei && this.suma >= suma) {
            this.suma -= suma;
            contDestinatie.setSuma(contDestinatie.getSuma() + suma);
        }
    }
}
