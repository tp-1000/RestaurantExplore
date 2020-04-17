package menubuilder;

import java.util.Scanner;

public class Restaurant {
    private static boolean isRunning = true;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to menu builder.");
        mainOptions();
    }


    private static void mainOptions() {
        do {
            System.out.println("\nWhat would you like to do?\n(1) add item  (2) preview  (3) edit item  (4) remove item  (0) quit");

            while(!input.next().matches("[0-4]")) {
                System.out.println("Please pick 0-3\n(1) add item  (2) preview  (3) edit item  (4) remove item  (0) quit");
            }
            String option = input.match().group();
            input.nextLine();
            switch (option) {
                case "1": Menu.addItemDialog();
                          Menu.updateTimeStamp();
                          break;
                case "2": Preview.the(Menu.toPrettyString());
                          break;
                case "3": if(Menu.getListArrayLength() > 0) {
                                Item.editItemDialog();
                                Menu.updateTimeStamp();
                          } else {
                                System.out.println("The menu is empty add items.");
                          }
                          break;
                case "4": if(Menu.getListArrayLength() > 0) {
                                Menu.removeItemDialog();
                                Menu.updateTimeStamp();
                          } else {
                                System.out.println("The menu is empty add items.");
                          }
                          break;
                case "0": quit();
                          break;
                default:  quit();
            }

        }
        while (isRunning);
        System.out.println("Goodbye");
    }

    private static void quit() {
        input.close();
        isRunning = false;
    }
}