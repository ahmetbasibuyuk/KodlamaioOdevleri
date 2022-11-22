package AccessDatabase;

import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {

    // Hibernate için
    // İnterface olan DAO'ların hepsi implement'e edildi.
    @Override
    public void add(Category category) throws Exception {
        String categoryName = "\n" + category.getCategoryName() + " kategorisi";

        System.out.println(categoryName + " hibernate ile eklendi");
    }

    @Override
    public void add(Course course) throws Exception {
        String courseName = course.getCourseName() + " isimli ve ";
        double coursePrice = course.getCoursePrice();

        System.out.println(courseName + coursePrice + " fiyatlı kurs " + "hibernate ile eklendi");
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        String firstName = instructor.getFirstName() + " ";
        String lastName = instructor.getLastName();

        System.out.println(firstName + lastName + " isimli eğitmen hibernate ile eklendi");
    }
}
