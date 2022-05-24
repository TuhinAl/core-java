package abstraction;

public interface BasicInfo extends EducationalBackground{

     void introduceYourself(String name);
     void introduceYourself(String name, int age);
     static void manStaticData(){
         System.out.println("I am a Human");
     }
}
