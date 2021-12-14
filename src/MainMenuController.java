import java.util.Scanner;

public class MainMenuController extends Startup {
    Scanner scn = new Scanner(System.in);


    MainMenuView mmv = new MainMenuView();

    public void mainMenu() {
        handlechoice(mmv.displayMenu());
    }

    public void handlechoice(int selection) {
        switch (selection){
            case 1:
                for(Items i : items) {
                    System.out.println("ProductID: "+ i.productID + ", Manufacturer: " +  i.manufacturer +
                            ", Product Name: " + i.productName
                            + ", Price: " + i.price +
                            ", Stock Available: " + i.stock);
                }
                break;


            case 2:
                int prod_id = items.get(items.size()-1).productID + 1;
//                for(int i =0; i < items.size() + 2; i++){
//                    prod_id = i;
//                }
                System.out.println("Please state Manufacturer");
                String manuf = scn.nextLine();
                System.out.println("Name of product : ");
                String name = scn.nextLine();
                System.out.println("Price of product: ");
                float price = Float.parseFloat(scn.nextLine());
                System.out.println("How much stock is available: ");
                int stock = Integer.parseInt(scn.nextLine());
                items.add(new Items(prod_id, manuf, name, price, stock));
                break;


            case 3 :
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
                break;


            case 4 :
                System.out.println("Please state product ID of the item you wish to update:");
                int deleteId = Integer.parseInt(scn.nextLine());
                for(int i = 0; i < items.size(); i++) {
                    if(deleteId == items.get(i).productID) {
                        items.remove(i);
                    }
                }
                break;


            default :
                System.out.println("Please selection option 1");

        }
        mainMenu();
    }
}
