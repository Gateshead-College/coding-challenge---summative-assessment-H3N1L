
public class Startup {

    public static void main(String[] args) {
        Login login = new Login();
        login.getUsers();
        login.getUserData();
        login.checkDetails();


    }

    public void getUserData() {
        InitialiseUsers init = new InitialiseUsers();

    }
}
