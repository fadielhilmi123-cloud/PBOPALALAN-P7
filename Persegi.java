package PBOTUGASPALALANPERTEMUAN7;

public class Persegi extends BangunDatar {
    private float s;

    public void setSisi(float sisi) {
        this.s = sisi;
    }

    public float getSisi() {
        return s;
    }

    @Override
    public float getLuas() {
        setLuas(s * s);
        return super.getLuas();
    }

    @Override
    public float getKeliling() {
        setKeliling(4 * s);
        return super.getKeliling();
    }
}

