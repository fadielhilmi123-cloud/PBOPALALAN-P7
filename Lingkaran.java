package PBOTUGASPALALANPERTEMUAN7;

public class Lingkaran extends BangunDatar {
    private float r;

    public void setJari(float jari) {
        this.r = jari;
    }

    public float getJari() {
        return r;
    }

    @Override
    public float getLuas() {
        setLuas((float) 3.14 * r * r);
        return super.getLuas();
    }

    @Override
    public float getKeliling() {
        setKeliling(2 * (float) 3.14 * r);
        return super.getKeliling();
    }
}

