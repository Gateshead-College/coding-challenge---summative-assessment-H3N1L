import java.util.ArrayList;

public class Startup {

    public static ArrayList<Items> items;

    public static void main(String[] args) {
        Startup s = new Startup();
        s.createItems();
    }

    private void createItems() {
        items = new ArrayList<>();
        items.add(new Items("Travis scott, Jordan 1"));
        items.add(new Items("Yeezy 350, V2 light"));
        items.add(new Items("Yeezy 350, Black Red"));
        items.add(new Items("Jordan 1, Student of the Year"));
        MainMenuController mmc = new MainMenuController();
        mmc.mainMenu();

    }
}
