public class ProductManager {

    public void add(Product product) {
//        ProductValidator productValidator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("eklendi");
        }
        else {
            System.out.println("eklenemedi");
        }

//        ProductValidator validator = new ProductValidator();
        ProductValidator.constructorDenemeMetodu();

    }



    public static class baskaClass{
        public void de(){

        }


    }


}
