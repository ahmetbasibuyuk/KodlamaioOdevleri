package Business;

import AccessDatabase.CategoryDao;
import Enitity.Category;


public class CategoryManager implements CategoryDao {


    // Yapılacak işlemlerin yönetimi için burada tanımlanır.




    // equalsIgnoreCase -> girilen String değeri küçük büyük bakmaksızın kontrol eder
    //          ona göre bir hata fırlatır
    @Override
    public void add(Category category) throws Exception {


        /*
        tek bir kategori olduğundan "Programlama" diye elimle yazdım. Liste,dizi gibi birşey verilebilir
        equalsIgnoreCase olduğundan Programlama,programlama yada PrOGraMLAMA gibi birşey yazılsada kabul eder
         */


        if (!category.getCategoryName().equalsIgnoreCase("Programlama")) {
            throw new Exception(category.getCategoryName() + " diye bir kategori bulunamadı. Yeniden seçin.");
        } else {
            System.out.println("Kategori Seçildi." + category.getCategoryName().substring(0, 1).toUpperCase() + category.getCategoryName().substring(1).toLowerCase());

             /*
            girilen kurs isminin substring'ini alır -> sıfırıncı indexten birinci indexe kadar(1 dahil değil).Yani ilk harfi alır onada toUpperCase uygular.
            küçük girilse dahi büyük yazar.
            Sonra diğer kalan harfler'e yine substring uygular -> birinci indexten itibaren sonuna kadar al ve toLowerCase uygula.Yani hepsi küçük olur.
            Küçük girilse bile

           categoryName -> Yani ilk harfe substring ve toupper case + geriye kalan harflere substring ve tolower case


             */
        }


    }
}
