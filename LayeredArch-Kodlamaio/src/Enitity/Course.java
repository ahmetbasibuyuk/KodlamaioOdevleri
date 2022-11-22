package Enitity;

public class Course {


    // Yapılacak işlemlerin isimleri; gerek değişkenler, constructor veya getter setter burada tanımlanır
    // yapılacak işlemler ne yapacaksa DAO'sunda tanımlanır
    // Yapılacak işlemlerin yönetimi için Manager'da tanımlanır.
    String courseName;
    double coursePrice;


    public Course(String courseName, double coursePrice) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
