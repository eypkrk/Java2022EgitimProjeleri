public class Main {
    public static void main(String[] args){
        int sayi1 = 18;
        int sayi2 = 25;
        int sayi3 = 13;
        int enBuyuk = sayi1;
        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        } else if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        System.out.println("en büyük" + enBuyuk);
    }
}
