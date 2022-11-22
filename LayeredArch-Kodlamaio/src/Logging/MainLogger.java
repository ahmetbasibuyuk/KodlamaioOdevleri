package Logging;


import Enitity.Category;
import Enitity.Course;
import Enitity.Instructor;

public interface MainLogger {


    // Base-Main(ana) loglama bölümü diğer sınıflar bundan implement'e eder.
    void log(Instructor instructor, Course course, Category category);

}
