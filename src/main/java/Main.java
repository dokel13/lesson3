import ua.mycompany.User;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .withName("Vasya")
                .withSurname("Stepanenko")
                .withEmail("eee@gmail.com")
                .withPassword("password")
                .withCode(123)
                .build();
    }
}
