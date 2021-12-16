public class User {

    String username;
    String password;
    String forename;
    String surname;
    int employeeID;
    boolean admin;


    public User(String username, String password, String forename, String surname, int employeeID, boolean admin) {
        this.username = username;
        this.password = password;
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.admin = admin;
    }

    public void updateUsername(String update) {
        this.username = update;
    }

    public void updatePassword(String update) {
        this.password = update;
    }

    public void updateForename(String update) {
        this.forename = update;
    }

    public void updateSurname(String update) {
        this.surname = update;
    }

    public void updateID(int update) {
        this.employeeID = update;
    }

}
