public class Main {
    public static void main(String[] args){

        char grade = 'l';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("Güzel: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef: Kaldınız");
                break;
            case 'G':
            default:
                System.out.println("Geçersiz Not Girdiniz!!!");
        }

    }
}
