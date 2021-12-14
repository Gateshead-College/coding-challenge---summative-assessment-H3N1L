public class MainMenuController extends Startup {

    public void mainMenu() {
        MainMenuView mmv = new MainMenuView();
        handlechoice(mmv.displayMenu());
    }

    private void handlechoice(int selection) {
        switch (selection){
            case 1:
                for(Items i : items) {
                    System.out.println(i.productName);
                }
            default :
                System.out.println("Please selection option 1");

        }
    }
}
