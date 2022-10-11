public class Main {
    public static void main(String[] args){

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
            System.out.println("Sayi dizinin içinde mevcuttur.");
        }else {
            System.out.println("Sayi dizinin içinde yoktur");
        }

    }
}
