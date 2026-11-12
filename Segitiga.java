package PBOTUGASPALALANPERTEMUAN7;


public class Segitiga extends BangunDatar {
    private float a;
    private float t;
    private float sA;
    private float sB;

    public void setAlas(float alas) {
        this.a = alas;
    }

    public void setTinggi(float tinggi) {
        this.t = tinggi;
    }

    public void setSisiA(float sisiA) {
        this.sA = sisiA;
    }

    public void setSisiB(float sisiB) {
        this.sB = sisiB;
    }

    public float getAlas() {
        return a;
    }

    public float getTinggi() {
        return t;
    }

    public float getSisiA() {
        return sA;
    }

    public float getSisiB() {
        return sB;
    }

    @Override
    public float getLuas() {
        setLuas(0.5f * a * t);
        return super.getLuas();
    }

    @Override
    public float getKeliling() {
        setKeliling(a + sA + sB);
        return super.getKeliling();
    }
}

