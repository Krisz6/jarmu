public class Robogo extends Jarmu implements KisGepjarmu{
    private int maximalisSebesseg;

    public Robogo(int aktualisSebesseg, String rendszam, int maximalisSebesseg) {
        super(aktualisSebesseg, rendszam);
        this.maximalisSebesseg = maximalisSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return getAktualisSebesseg() > sebessegkorlat;
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return maximalisSebesseg < sebesseg;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
}
