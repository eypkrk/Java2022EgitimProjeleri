public class Main {
    public static void main(String[] args){
          Product product = new Product(1,"Laptop", "Asus Laptop",3000,2,"Siyah");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
//        product.setRenk("Sarı");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

        //System.out.println(product.name);


        //productManager.Add2(1,"d","s",2,3);


        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] s1 = {1,2,3};
        int[] s2 = {4,5,6};
        s2 = s1;
        s1[0] = 10;
        System.out.println(s2[0]);

    }
}
