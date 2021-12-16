import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    Scanner scn = new Scanner(System.in);

    ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Login login = new Login();
        login.getUsers();
        login.checkDetails();

    }

    private void checkDetails() {
        System.out.println("Please enter username: ");
        String username = scn.nextLine();
        for(User u : users) {
            if (Objects.equals(username, u.username)) {
                System.out.println("Please enter password");
                String password = scn.nextLine();
                if(Objects.equals(password, u.password)) {
                    MainMenuController menu = new MainMenuController();
                    menu.startUp();
                }
            }
        }
    }

    private void getUsers() {
        users.add(new User("Henil", "Siuuu","Henil", "Soni", 1, true));
    }
}
