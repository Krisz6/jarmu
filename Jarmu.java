public abstract class Jarmu {
    private int aktualisSebesseg;
    private String rendszam;

    public Jarmu(int aktualisSebesseg, String rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }
    public abstract boolean gyorshajtottE(int sebessegkorlat);

    @Override
    public String toString() {
        return rendszam + " - " + aktualisSebesseg + " km/h";
    }

    public int getAktualisSebesseg() {
        return aktualisSebesseg;
    }
}
