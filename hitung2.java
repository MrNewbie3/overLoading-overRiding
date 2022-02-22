package overloadOverride;

public class hitung2 {
    public static void main(String[] args) {
        bangunDatar bangundatar=new bangunDatar();

        persegi Persegi = new persegi();
        Persegi.sisi=8;

        persegiPanjang perjang =new persegiPanjang();
        perjang.lebar=11;
        perjang.panjang=2;


        bangundatar.luas();
        bangundatar.keliling();

        Persegi.luas();
        Persegi.keliling();

        perjang.luas();
        perjang.keliling();

    }
}
