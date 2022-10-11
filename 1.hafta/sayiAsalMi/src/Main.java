public class Main {
    public static void main(String[] args){

        int number = -1;
        int remainder = number % 2;
        int s = 0;
        System.out.println(remainder);
        if (number < 1){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                s++;
            }
        }
        System.out.println(s);
        if (s != 0){
            System.out.println("Sayı asal değil");
        } else if ( number == 2) {
            System.out.println("Sayı asal değil");
        } else {
            System.out.println("Sayı asaldır");
        }

    }
}
