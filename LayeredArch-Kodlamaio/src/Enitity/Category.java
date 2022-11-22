package Enitity;

public class Category {

    // Yapılacak işlemlerin isimleri; gerek değişkenler, constructor veya getter setter burada tanımlanır
    // yapılacak işlemler ne yapacaksa DAO'sunda tanımlanır
    // Yapılacak işlemlerin yönetimi için Manager'da tanımlanır.


    String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
