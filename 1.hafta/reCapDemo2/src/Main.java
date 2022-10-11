public class Main {
    public static void main(String[] args){

        double[] myList ={1.2,3.5,4.2,8.4};
        double total = 0;
        double max = myList[0];
        for (double number:myList){
            total += number;
            System.out.println(number);
            if (max < number){
                max = number;
            }
        }
        System.out.println("En  büyük: " + max);
        System.out.println("Toplam: "+total);
    }
}
