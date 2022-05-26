package abstraction;

public abstract class Scholar extends Human {

    public abstract void ponditActivity();

    public void activities(){
        System.out.println("This is pondit activities!!");
    }

    Scholar() {
        super();

    }

    public static void main(String[] args) {
        Scholar scholar = new Scholar() {
            @Override
            public void ponditActivity() {

            }
        };
    }
}
