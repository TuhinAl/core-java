package abstraction;

import java.util.Locale;

public class Person extends School implements BasicInfo, Hobbies{

    private String name;
    private String email;
    private String address;

    public Person(String name, String email, String address) {
        System.out.println("person constructor!");
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public void study() {
        System.out.println("study method from Person class");
    }

    @Override
    public void introduceYourself(String name) {
        System.out.println("introduceYourself from person class: "+name.toUpperCase(Locale.ROOT));
    }

    @Override
    public void introduceYourself(String name, int age) {
        System.out.println("introduceYourself from person class: "+name.toUpperCase(Locale.ROOT) +" and age is: "+age);
    }

    @Override
    public void printSSC(String roll, String passingYear) {

        System.out.println("Person Class: roll is" + roll + " and passing year is: " + passingYear);
    }

    @Override
    public void sayYourHobby() {
        System.out.println("My hobby is R&D.");
    }

//    public abstract personAbstract(); not working

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
