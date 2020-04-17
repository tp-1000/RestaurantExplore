package menubuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static ArrayList<Item> listItems = new ArrayList<>();

    private static String lastEdit = "";




    public static String toPrettyString() {
        String menuView = "";
        for (Item item: listItems) {
            menuView += item + "\n";
        }
        return menuView;
    }
    
    public static int getListArrayLength() {
        return listItems.size();
    }

    public static ArrayList<Item> getListArray() {
        return listItems;
    }

    public static void addItemDialog() {
        //dialog prompts for item generation
        System.out.println("Add an item...");

        System.out.println("Name: ");
        String name = Restaurant.input.nextLine();
        Restaurant.input.reset();
        if(name.equals("")) {
            name = "tbd";
        }

        System.out.println("Price: ");
        String price = Restaurant.input.nextLine();
        if(price.equals("")) {
            price = "tbd";
        }

        System.out.println("Description: ");
        String description = Restaurant.input.nextLine();
        if(description.equals("")) {
            description = "tbd";
        }

        System.out.println("category: ");
        String category = Restaurant.input.nextLine();
        if(category.equals("")) {
            category = "tbd";
        }

        System.out.println("is it a new item enter 'true' or 'false': ");
        String isNew = Restaurant.input.nextLine();
        while (!isNew.matches("false|true")) {
            System.out.println("enter 'true' or 'false':");
            isNew = Restaurant.input.nextLine();
        }

        listItems.add(new Item(name,price,description,category,isNew));
        System.out.println("–end item add–");
    }

    public static void removeItemDialog() {
        //dialog prompts deletion of listItem at index
        System.out.println("Now removing...");

        Item item = getItemDialog();
        System.out.println("Removed " + item.getName());
        listItems.remove(item);
     }

     public static Item getItemDialog() {
        //presented with a list of items in the menu -- selected item gets returned
         System.out.println("\nPick an item: ");
         Preview.editList();

         String customRange = "[0-" + getListArrayLength() + 1 + "]";
         while(!Restaurant.input.next().matches(customRange)) {
            System.out.println("Please pick 0-" + getListArrayLength() + 1 + "] to select item");
         }
         Integer option = Integer.parseInt(Restaurant.input.match().group());

         return Menu.getListArray().get(option);
    }

    public static String getLastEdit() {
        return lastEdit;
    }

    public static String updateTimeStamp() {
        Date myDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh-mm");
        lastEdit = dateFormat.format(myDate);
        return lastEdit;
    }
}

