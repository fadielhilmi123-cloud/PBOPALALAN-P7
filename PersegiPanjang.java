package PBOTUGASPALALANPERTEMUAN7;

public class PersegiPanjang extends BangunDatar {
    private float p;
    private float l;

    public void setPanjang(float panjang) {
        this.p = panjang;
    }

    public void setLebar(float lebar) {
        this.l = lebar;
    }

    public float getPanjang() {
        return p;
    }

    public float getLebar() {
        return l;
    }

    @Override
    public float getLuas() {
        setLuas(p * l);
        return super.getLuas();
    }

    @Override
    public float getKeliling() {
        setKeliling(2 * (p + l));
        return super.getKeliling();
    }
}

