public class AudiS8 extends Jarmu {

    private boolean lezerblokkolo;

    public AudiS8(int aktualisSebesseg, String rendszam, boolean lezerblokkolo) {
        super(aktualisSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        if (lezerblokkolo){
            return false;
        } else {
            return getAktualisSebesseg() > sebessegkorlat;
        }
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
