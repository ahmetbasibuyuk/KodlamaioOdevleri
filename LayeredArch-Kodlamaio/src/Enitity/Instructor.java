package Enitity;

public class Instructor {

    // Yapılacak işlemlerin isimleri; gerek değişkenler, constructor veya getter setter burada tanımlanır
    // yapılacak işlemler ne yapacaksa DAO'sunda tanımlanır
    // Yapılacak işlemlerin yönetimi için Manager'da tanımlanır.

    String firstName;
    String lastName;

    public Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
