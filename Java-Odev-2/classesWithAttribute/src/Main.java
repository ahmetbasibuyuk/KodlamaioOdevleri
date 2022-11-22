

public class Main {
    public static void main(String[] args) {

        // constructorsız olduğu için aşağıdaki ayarlar açılmalıdır
        Product product = new Product();

        // setter kullanılmadan bir değer atandı
//        product.id = 1;
//        product.name = "Laptop";
//        product.description = "Asus laptop";
//        product.price = 20000;
//        product.stockAmount = 3;


        // setter kullanılarak bir değer atandı
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(20000);
        product.setStockAmount(3);

        //-------------------------------------------------------------------------------------
                        //sadece bunun kullanılması yeterli çünkü "Product" sınıfında zaten parametreli
                                            //constructor'ın ayarları yapıldı
//        Product product = new Product(1,"Laptop","Asus Laptop",20000,3);




        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}