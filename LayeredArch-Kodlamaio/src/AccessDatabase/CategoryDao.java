package AccessDatabase;

import Enitity.Category;

public interface CategoryDao {


    // kategori ekleme-seçme
    // yapılacak işlemler ne yapacaksa burada tanımlanır
    void add(Category category) throws Exception;

}
