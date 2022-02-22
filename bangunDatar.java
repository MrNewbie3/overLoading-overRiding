package overloadOverride;

public class bangunDatar {
    double luas;
    double a=0.5;
//overLoad (berada dalam satu class begitu juga this)
    void luas(double panjang , double lebar){
        this.luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        this.luas= panjang * lebar*a;
        System.out.println("luas kedua = "+luas);
    }
//    Override (berada di class yang berbeda sama seperti super)
public void luas(){
    System.out.println("menghitung luas lingkaran");

}
    public void keliling(){
        System.out.println("menghitung keliling lingkaran");

    }
}
