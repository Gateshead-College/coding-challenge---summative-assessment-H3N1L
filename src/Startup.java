import java.util.ArrayList;

public class Startup {

    public static ArrayList<Items> items;

    public static void main(String[] args) {
        Startup s = new Startup();
        s.createItems();
    }
    private void createItems() {
        items = new ArrayList<>();
        items.add(new Items(1,"Nike","Travis scott, Jordan 1",1000, 5 ));
        items.add(new Items(2,"Adidas","Yeezy 350, V2 light", 300, 10));
        items.add(new Items(3,"Adidas","Yeezy 350, Black Red", 267, 15 ));
        items.add(new Items(4,"Nike", "Jordan 1, Student of the Year", 600, 2));
        MainMenuController mmc = new MainMenuController();
        mmc.mainMenu();
    }
}
