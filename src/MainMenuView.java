import java.util.Scanner;

public class MainMenuView {

    public int displayMenu() {
        System.out.println("Welcome to the XXXXXXX online retail platform ");
        System.out.println("Please select what you you are after");
        System.out.println("1- list items available");
        System.out.println("2- Add new items");
        System.out.println("3- Update item");
        System.out.println("4- Remove item");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }


}
