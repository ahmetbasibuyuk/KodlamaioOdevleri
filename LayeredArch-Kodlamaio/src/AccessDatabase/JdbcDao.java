package AccessDatabase;

import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao {

    // JDBC için
    // İnterface olan DAO'ların hepsi implement'e edildi.
    @Override
    public void add(Category category) throws Exception {
        String categoryName = "\n" + category.getCategoryName() + " kategorisi";

        System.out.println(categoryName + " JDBC ile eklendi");
    }

    @Override
    public void add(Course course) throws Exception {
        String courseName = course.getCourseName() + " isimli ve ";
        double coursePrice = course.getCoursePrice();

        System.out.println(courseName + coursePrice + " fiyatlı kurs " + "JDBC ile eklendi");
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        String firstName = instructor.getFirstName() + " ";
        String lastName = instructor.getLastName();

        System.out.println(firstName + lastName + " isimli eğitmen JDBC ile eklendi");
    }
}
