public class ContEuro extends ContBancar {
    public ContEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return suma * 36000;
    }

    public float getDobanda() {
        if (suma > 500) {
            return 0.3f;
        } else {
            return 0.0f;
        }
    }
}
