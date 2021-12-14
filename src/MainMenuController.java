public class MainMenuController extends Startup {

    public void mainMenu() {
        MainMenuView mmv = new MainMenuView();
        handlechoice(mmv.displayMenu());
    }

    private void handlechoice(int selection) {
        switch (selection){
            case 1:
                for(Items i : items) {
                    System.out.println("ProductID: "+ i.productID + ", Manufacturer: " +  i.manufacturer +
                            ", Product Name: " + i.productName
                            + ", Price: " + i.price +
                            ", Stock Available: " + i.stock);
                }
            default :
                System.out.println("Please selection option 1");

        }
    }
}
