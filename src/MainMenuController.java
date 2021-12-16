
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenuController {
    Scanner scn = new Scanner(System.in);

    ArrayList<Items> items = new ArrayList<>();

    public void startUp() {
        AddItems();
        getData();
    }

    public void getData() {
        Initialise init = new Initialise();
        items = init.getItems(init.readFile(Initialise.stockitems));
        mainMenu();
    }


    public void mainMenu() {
        System.out.println("Please select what you want to do");
        System.out.println("1- List items available");
        System.out.println("2- Add new items");
        System.out.println("3- Update item");
        System.out.println("4- Remove item");
        System.out.println("5- Exit");
        int selection = Integer.parseInt(new Scanner(System.in).nextLine());
        handlechoice(selection);
    }

    public void handlechoice(int selection) {
        switch (selection){
            case 1:
                displayStock();
                break;
            case 2:
                addItem();
                break;
            case 3 :
                updateItem();
                break;
            case 4 :
                deleteItem();
                break;
            case 5 :
                exitApplication();
                return;
            default :
                System.out.println("Please selection option 1");
        }
        mainMenu();
    }

    private void exitApplication() {
        Initialise.writeData(items);
    }

    private void deleteItem() {
        System.out.println("Please state product ID of the item you wish to update:");
        int deleteId = Integer.parseInt(scn.nextLine());
        for(int i = 0; i < items.size(); i++) {
            if(deleteId == items.get(i).productID) {
                items.remove(i);
            }
        }
    }

    private void updateItem() {
        System.out.println("Please state product ID of the item you wish to update:");
        int id = Integer.parseInt(scn.nextLine());
        for(int i = 0; i < items.size(); i++) {
            if(id == items.get(i).productID){
                System.out.println("Stock Update");
                int updatedStock = Integer.parseInt(scn.nextLine());
                items.get(i).updatestock(updatedStock);
                System.out.println("Stock of " + items.get(i).productName +  ", has been updated");
            }
        }
    }

    private void addItem() {
        int prod_id;
        if (items.size() > 0) {
            prod_id = items.get(items.size() - 1).productID + 1;
        }
        else { prod_id = 1;}

        System.out.println("Please state Manufacturer");
        String manuf = scn.nextLine();
        System.out.println("Name of product : ");
        String name = scn.nextLine();
        System.out.println("Price of product: ");
        float price = Float.parseFloat(scn.nextLine());
        System.out.println("How much stock is available: ");
        int stock = Integer.parseInt(scn.nextLine());
        items.add(new Items(prod_id, manuf, name, price, stock));
        Initialise.writeData(items);
    }

    private void displayStock() {
        for(Items i : items) {
            System.out.println("ProductID: "+ i.productID + ", Manufacturer: " +  i.manufacturer +
                    ", Product Name: " + i.productName
                    + ", Price: " + i.price +
                    ", Stock Available: " + i.stock);
        }
    }

    public void AddItems() {
        items.add(new Items(1,"Nike","Travis scott, Jordan 1",1000, 5 ));
        items.add(new Items(2,"Adidas","Yeezy 350, V2 light", 300, 10));
        items.add(new Items(3,"Adidas","Yeezy 350, Black Red", 267, 15 ));
        items.add(new Items(4,"Nike", "Jordan 1, Student of the Year", 600, 2));
    }
}
