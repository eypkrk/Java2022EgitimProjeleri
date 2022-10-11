public class Main {
    public static void main(String[] args){
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0,2);
        String yeniSehir = sehirVer();
        System.out.println(yeniMesaj);
        System.out.println(yeniSehir);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int sayilar = topla2(5,8,7,9,2,4,5,4,54);
        System.out.println(sayilar);



    }

    public static void ekle (){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Sil");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static String sehirVer(){
        return "Ankara";
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2 (int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar){
            toplam += sayi;
        }
        return toplam;
    }

}