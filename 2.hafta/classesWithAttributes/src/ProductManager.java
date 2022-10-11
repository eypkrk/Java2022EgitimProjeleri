public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün Eklendi " + product.getName() + "\n" + "Ürün Kodu: " + product.getKod());
    }

    public void Add2(int id, String name, String description, double price, int stockAmount, String renk){

    }
}
