public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı.");

    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        //STATİC olarak kullandığımızda Classismi=ProductValidator.isValid olarak çağırabiliriz.
        //STATİC İlk çalıştıran çağırır ve oluşur. Uygulama kapanana kadar hafızadan silinmez.
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void bisey(){

    }
}
