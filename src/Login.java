import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    Scanner scn = new Scanner(System.in);

    ArrayList<User> users = new ArrayList<>();


    public void checkDetails() {
        MainMenuController menu = new MainMenuController();
        System.out.println("Please enter username: ");
        String username = scn.nextLine();
        for (User u : users) {
            if (Objects.equals(username, u.username)) {
                System.out.println("Please enter password");
                String password = scn.nextLine();
                if (Objects.equals(password, u.password)) {
                    System.out.println("Correct details entered, logging you in ...");
                    menu.startUp();
                }
            }
        }
    }

    public void getUsers() {
        users.add(new User("Henil13", "Password", "Henil", "Soni", 1, true));
        users.add(new User("CR7", "Siuuu", "Cristiano", "Ronaldo", 2, false));
        users.add(new User("Spider-man", "Avengers", "Peter", "Parker", 3, false));
    }

    public void accountMenu() {
        System.out.println("Welcome to Account settings");
        System.out.println("---------------------------");
        System.out.println("What would you like to edit");
        System.out.println("1 - Username");
        System.out.println("2 - Password");
        System.out.println("3 - Firstname");
        System.out.println("4 - Surname");
        System.out.println("5 - ID");
//        System.out.println("6- View Details");
        choice(Integer.parseInt(scn.nextLine()));
    }

    private void choice(int selection) {
        switch (selection) {
            case 1:
                System.out.println("Please Enter Current Username: ");
                String currentName = scn.nextLine();
                for (User i : users) {
                    if (currentName.equals(i.username)) {
                        System.out.println("Please enter new Username: ");
                        String updatedUserName = scn.nextLine();
                        i.updateUsername(updatedUserName);
                    }
                }
                accountMenu();
            case 2:
                System.out.println("Please Enter Current Password: ");
                String currentpw = scn.nextLine();
                for (User i : users) {
                    if (currentpw.equals(i.password)) {
                        System.out.println("Please enter new UPassword: ");
                        String updatedPassword = scn.nextLine();
                        i.updatePassword(updatedPassword);

                    }
                }
                accountMenu();
                break;

            case 3:
                System.out.println("Please Enter Forename: ");
                String currentFirstName = scn.nextLine();
                for(User i : users) {
                    if (currentFirstName.equals(i.forename)) {
                        System.out.println("Please enter updated Forename: ");
                        String updatedForename = scn.nextLine();
                        i.updateForename(updatedForename);
                    }
                }
                accountMenu();
                break;
            case 4:
                System.out.println("Please Enter Current Surname: ");
                String currentSurname = scn.nextLine();
                for(User i : users) {
                    if (currentSurname.equals(i.surname)) {
                        System.out.println("Please enter new Surname: ");
                        String updatedSurname = scn.nextLine();
                        i.updateSurname(updatedSurname);
                    }
                }
                accountMenu();
                break;

            case 5:
                System.out.println("Please Enter Current ID: ");
                int currentID = Integer.parseInt(scn.nextLine());
                for(User i : users) {
                    if (currentID == i.employeeID) {
                        System.out.println("Please enter new ID: ");
                        int updatedID = Integer.parseInt(scn.nextLine());
                        i.updateID(updatedID);
                    }
                }
                accountMenu();
                break;

//            case 6:
//                System.out.println("Please enter account ID: ");
//                int id = Integer.parseInt(scn.nextLine());
//                for(User u : users) {
//                    if(id == u.employeeID) {
//                        System.out.println("Retrieving your details ...");
//                        System.out.println("Username: " + u.username + " Password: " +
//                                u.password + " Firstname: " + u.forename +
//                                " Surname: " + u.surname + " ID: " + u.employeeID);
//                    }
//                }
//                accountMenu();
//                break;

            default :
                System.out.println("Error, please choose a valid option");

        }
    }
}