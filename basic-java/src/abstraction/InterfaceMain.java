package abstraction;

public class InterfaceMain {

    public static void main(String[] args) {
        Person person = new Person("Selim Ahmed", "selim@gmail.com", "Dhaka, Bangladesh");

        Person polymorphicPerson = new Human("Jasim Uddin", "jasim@gmail.com", "Dhaka, bangladesh", "Dumuria, Khulna", "010545435");
        System.out.println("person: ");

    }
}
