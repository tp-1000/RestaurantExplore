package menubuilder;

public class Item {


    private String name = "";
    private String price = "";
    private String description = "";
    private String category = "";
    private String isNewItem = "";


    public Item(String aName, String aPrice, String aDescription, String aCategory, String aIsNewItem) {
        name = aName;
        price = aPrice;
        description = aDescription;
        category = aCategory;
        isNewItem = aIsNewItem;
    }


    @Override
    public String toString() {
        String isNew = "";
        if(isNewItem.equals("true")) {
            isNew = "new! ";
        }
        return String.format("|  %5.5s %15.15s :%-15.15s –%-50.50s %10s $%5.5s  |",  isNew, name, category, description, "..... ", price);
    }

    public static void editItemDialog() {
        System.out.println("now editing...");
        Item item = Menu.getItemDialog();
        System.out.println("\nedit " + item.getName() + "...\n...pick property to edit:\n(1) name  (2) price  (3) description  (4) category  (5) 'is it new' status  (0) cancel");

        while(!Restaurant.input.next().matches("[0-5]")) {
            System.out.println("Please pick 0-2\n(1) name  (2) price  (3) description  (4) category  (5) 'is it new' status  (0) cancel");
        }
        String option = Restaurant.input.match().group();
        Restaurant.input.nextLine();

        switch (option) {
            case "1": System.out.println("Enter new name...");
                      item.setName(Restaurant.input.nextLine());
                      System.out.println(".... new name set.");
                      break;
            case "2": System.out.println("Enter new price...");
                      item.setPrice(Restaurant.input.nextLine());
                      System.out.println(".... new price set.");
                      break;
            case "3": System.out.println("Enter new description...");
                      item.setDescription(Restaurant.input.nextLine());
                      System.out.println(".... new description set.");
                      break;
            case "4": System.out.println("Enter new category...");
                      item.setCategory(Restaurant.input.nextLine());
                      System.out.println(".... new category set.");
                      break;
            case "5": System.out.println("Enter new item status...");
                      item.setIsNewItem(Restaurant.input.nextLine());

                      String isNew = Restaurant.input.nextLine();
                      while (!isNew.matches("true|false")) {
                        System.out.println("enter 'true' or 'false':");
                        isNew = Restaurant.input.nextLine();
                      }

                      System.out.println(".... new item status set.");
                      break;
            case "0": break;
            default:  break;
        }
        System.out.println("–end edit–");
    }


    private void setName(String aName) {
        name = aName;
    }
    private void setPrice(String price) {
        this.price = price;
    }
    private void setDescription(String description) {
        this.description = description;
    }
    private void setCategory(String category) {
        this.category = category;
    }
    private void setIsNewItem(String isNewItem) {
        this.isNewItem = isNewItem;
    }

    public String getName() {
        return name;
    }

}



