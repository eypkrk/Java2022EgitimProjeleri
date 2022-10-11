public class Main {
    public static void main(String[] args){
        char harf = 'E';
                if(harf == 'A' ){
                    System.out.println("Kalın sesli harf");
                } else if (harf == 'I') {
                    System.out.println("Kalın sesli harf");
                } else if (harf =='O') {
                    System.out.println("Kalın sesli harf");
                } else if (harf == 'U') {
                    System.out.println("Kalın sesli harf");
                }else {
                    System.out.println("İnce sesli harf");
                }
            switch (harf){
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın sesli harf");
                break;
                    default:
                    System.out.println("İnce sesli harf");
                break;
                }
    }
}
