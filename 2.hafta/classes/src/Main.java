public class Main {
    public static void main(String[] args){
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();//bellekte ihtiyaç duyduğumuzda newlemeliyiz alan tutar
        //STACK çekilen yer HEAP belekte kullanılmak için açılan yer
        // GARBAGE COLLECTOR çöp toplayıcı en üst satırda ki new boşa düştüğü için HEAP den açılan alanı siler.
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1 = 10;
        int sayi2 = 30;
        sayi1 = sayi2;
        sayi2 = 20;
        System.out.println(sayi1);


        int [] sayilar1 = {1,2,3};
        int [] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
