public class ProductManager {

    public void Add(Product product) {

        // getter olmadan
//        System.out.println("--- Burada getter kullanılmadı ---");
//        System.out.println(
//                "Ürün Eklendi.\n" +
//                        "İsim: " + product.name +
//                        "\nAçıklama: " + product.description +
//                        "\nFiyat: " + product.price +
//                        "\nStok Adedi: " + product.stockAmount
//
//
//        );



        // erişim olmadığı için getter kullanılarak okundu
        System.out.println("--- Burada getter kullanıldı ---");
        System.out.println(
                "Ürün Eklendi.\n" +
                        "İsim: " + product.getName() +
                        "\nAçıklama: " + product.getDescription() +
                        "\nFiyat: " + product.getPrice() +
                        "\nStok Adedi: " + product.getStockAmount()


        );






    }
}
