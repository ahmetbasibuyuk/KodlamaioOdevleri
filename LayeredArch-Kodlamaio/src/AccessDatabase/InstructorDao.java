package AccessDatabase;

import Enitity.Instructor;

public interface InstructorDao {

    // Eğitmen ekleme-seçme
    // yapılacak işlemler ne yapacaksa burada tanımlanır
    void add(Instructor instructor) throws Exception;

}
