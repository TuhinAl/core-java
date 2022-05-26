package abstraction;

public class Human extends Person{

    private String address;
    private String phone;

    public Human(String name, String email, String address, String address1, String phone) {
        super(name, email, address);
        System.out.println("human constructor");
        this.address = address1;
        this.phone = phone;
    }
    Human() {
        super();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
