public class ProductValidator {


    public ProductValidator(){
        System.out.println("yapıcı blok çalıtşır");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void constructorDenemeMetodu(){

    }

}
