
public class Main {

    public static void main(String[] args) {
        // Create a builder
        User user1 = new User.UserBuilder("Mohamed", "Hussien")
        .setAge(10)
        .setAddress("Alex")
        .setPhone("0123456789")
        .build();
        user1.printInfo();
    }
}
