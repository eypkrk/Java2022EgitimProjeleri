public class Main {
    public static void main(String[] args){
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(5,7);
        System.out.println(sonuc);
        System.out.println(dortIslem.Cikar(8,3));
        System.out.println(dortIslem.Carp(9,5));
        System.out.println(dortIslem.Bol(8,4));
    }
}
