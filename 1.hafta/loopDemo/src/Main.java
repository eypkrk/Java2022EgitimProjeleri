public class Main {
    public static void main(String[] args){
        // i değerini 1 den başlatıp i+2 dersek tek sayıları yazar
        // i değerini 2 den başlatıp i+2 dersek çift sayıları yazar.

        for (int i =1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        int i = 2;
        while(i <= 10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");
        int j =1;
        do {
            System.out.println(j);
            j+=2;
        }while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
