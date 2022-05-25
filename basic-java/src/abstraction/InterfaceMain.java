package abstraction;

public class InterfaceMain {

    public static void main(String[] args) {

        Person person = new Person("Selim Ahmed", "selim@gmail.com", "Dhaka, Bangladesh");

        Person polymorphicPerson = new Human("Jasim Uddin", "jasim@gmail.com", "Dhaka, bangladesh", "Dumuria, Khulna", "010545435");

//        Human human = new Person("Rahman", "rahman@gmail.com", "Jessore, Bangladesh");

        person.introduceYourself("Dipro", 28);
        BasicInfo.manStaticData();
        EducationalBackground.institutionBuilding();
        person.sayYourHobby();
        person.groupStudy();
        person.study();

        polymorphicPerson.introduceYourself("Atik", 24);
        polymorphicPerson.sayYourHobby();
        polymorphicPerson.groupStudy();
        polymorphicPerson.study();
    }
}
