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
        return "Item{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNewItem='" + isNewItem + '\'' +
                '}';
    }
}
