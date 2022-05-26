package abstraction;

public class Teacher extends Scholar {


    @Override
    public void ponditActivity() {

    }

    public void scholar(){
        System.out.println(" scholar method check.");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        }

}
