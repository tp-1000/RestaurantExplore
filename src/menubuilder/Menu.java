package menubuilder;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> listItems = new ArrayList<>();




    @Override
    public String toString() {
        return "Menu{" +
                "listItems=" + listItems +
                '}';
    }

    //TODO format the menu below is a test for one item
    public void testString () {
//        System.out.println(String.format("|%-20s| |%-20s|", "Dig the dog"));
    }

    public void add(Item item) {
        this.listItems.add(item);
        System.out.println("menu item added");
    }

    public void edit(int i) {
        Item editItem = this.listItems.get(i);
        System.out.println("menu item " + editItem + " edited");
    }

    public void remove(int i) {
        this.listItems.remove(i);
        System.out.println("menu item removed");
    }
}
