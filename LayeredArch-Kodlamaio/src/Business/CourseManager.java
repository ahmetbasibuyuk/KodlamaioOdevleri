package Business;

import AccessDatabase.CourseDao;
import Enitity.Course;

import java.util.ArrayList;
import java.util.List;


public class CourseManager implements CourseDao {

    // Yapılacak işlemlerin yönetimi için burada tanımlanır.

    @Override
    public void add(Course course) throws Exception {


        if (course.getCoursePrice() < 0) {
            throw new Exception("Fiyat sıfırdan küçük olamaz.");
        }


        // bunlarıda elimle yazdım. Normalde veriler bir yerden gelir.
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C# + Angular");
        list.add(".Net");
        list.add("JavaScript");
        list.add("Java + React");
        list.add("Programlama Giriş");
        boolean containsSearchStr = list.stream().anyMatch(course.getCourseName()::equalsIgnoreCase);
        if (!containsSearchStr) {
            throw new Exception("Böyle bir kurs yok. Başka kurs seçin");
        } else {
            System.out.println("Kurs Seçildi: " + course.getCourseName().substring(0, 1).toUpperCase() + course.getCourseName().substring(1).toLowerCase());
            /*
            girilen kurs isminin substring'ini alır -> sıfırıncı indexten birinci indexe kadar(1 dahil değil).Yani ilk harfi alır onada toUpperCase uygular.
            küçük girilse dahi büyük yazar.
            Sonra diğer kalan harfler'e yine substring uygular -> birinci indexten itibaren sonuna kadar al ve toLowerCase uygula.Yani hepsi küçük olur.
            Küçük girilse bile

           courseName -> Yani ilk harfe substring ve toupper case + geriye kalan harflere substring ve tolower case


             */
        }


    }

}



