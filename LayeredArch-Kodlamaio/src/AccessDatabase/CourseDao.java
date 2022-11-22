package AccessDatabase;

import Enitity.Course;

public interface CourseDao {

    // Kurs ekleme-seçme
    // yapılacak işlemler ne yapacaksa burada tanımlanır
    void add(Course course) throws Exception;

}
