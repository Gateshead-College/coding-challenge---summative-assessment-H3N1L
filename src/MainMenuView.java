import java.util.Scanner;

public class MainMenuView {

    public int displayMenu() {
        System.out.println("Welcome to the XXXXXXX online retail platform ");
        System.out.println("Please select what you you are after");
        System.out.println("1- list items available");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }


}
