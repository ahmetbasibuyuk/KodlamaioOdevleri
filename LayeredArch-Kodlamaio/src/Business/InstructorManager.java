package Business;


import AccessDatabase.InstructorDao;
import Enitity.Instructor;

public class InstructorManager implements InstructorDao {


    // Yapılacak işlemlerin yönetimi için burada tanımlanır.



    // equalsIgnoreCase -> girilen String değeri küçük büyük bakmaksızın kontrol eder
    //          ona göre bir hata fırlatır
    @Override
    public void add(Instructor instructor) throws Exception {

        //bu değişkenlerin bir farkı yok sade olması açısından bir değişkene eşitlendi
        String firstName = instructor.getFirstName();
        String lastName = instructor.getLastName();


        // tek bir eğitmen olduğu için elimle yazdım. Yine liste,dizi gibi birşey verilebilir
        if (!instructor.getFirstName().equalsIgnoreCase("Engin") && instructor.getLastName().equalsIgnoreCase("Demiroğ")) {
            throw new Exception(firstName + " " + lastName + " diye bir eğitmen bulunamadı. Başka eğitmen seçin");

        } else {
            System.out.println("Eğitmen seçildi: " + instructor.getFirstName().substring(0, 1).toUpperCase() + instructor.getFirstName().substring(1).toLowerCase()
                    + " " + instructor.getLastName().substring(0, 1).toUpperCase() + instructor.getLastName().substring(1).toLowerCase());
        }

             /*
            girilen eğitmen isminin substring'ini alır -> sıfırıncı indexten birinci indexe kadar(1 dahil değil).Yani ilk harfi alır onada toUpperCase uygular.
            küçük girilse dahi büyük yazar.
            Sonra diğer kalan harfler'e yine substring uygular -> birinci indexten itibaren sonuna kadar al ve toLowerCase uygula.Yani hepsi küçük olur.
            Küçük girilse bile

           firstName -> Yani ilk harfe substring ve toupper case + geriye kalan harflere substring ve tolower case
           lastName -> Yine ilk harfe substring ve toupper case + geriye kalan harflere substring ve tolower case

             */


    }


}
