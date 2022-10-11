public class Main {
    public static void main(String[] args){
        sayiBulma();
    }

    public static void sayiBulma(){
        int[] sayi = new int[]{1,3,7,9,4,0};
        int index = 8;
        boolean varMi = false;
        for (int sayilar : sayi) {
            if (sayilar == index){
                varMi = true;
                break;
            }
        }
        if (varMi){
            mesajVer("Sayi dizinin içinde mevcuttur:" +index);
        }else {
            mesajVer("Sayi dizinin içinde yoktur: " +index);
        }

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
