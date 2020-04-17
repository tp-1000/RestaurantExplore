package menubuilder;



public class Resturant {

    private static Menu menu = new Menu();
    private static boolean isRunning = true;



    public static void main(String[] args) {

        System.out.println("Welcome");
        do {
            menu.add(new Item("Pizza1", "2.50", "cheese, crust, sauce", "Desert", "new"));
            menu.add(new Item("Pizza2", "2.50", "cheese, crust, sauce", "Desert", "new"));
            menu.add(new Item("Pizza3", "2.50", "cheese, crust, sauce", "Desert", "new"));
            menu.edit(0);
            menu.remove(0);
            Preview.the(menu);
            quit();
        }
        while (isRunning);

        System.out.println("Goodbye");


    }

    private static void quit() {
        isRunning = false;
    }
}
