package menubuilder;


import java.util.ArrayList;

public class Preview {

    public static void the(String s) {
        System.out.println("menu looks like this ----- last edit " + Menu.getLastEdit() + "\n" + s);
    }

    public static void editList() {
        int i = 0;
        for (Item item : Menu.getListArray()) {
            System.out.println("(" + i + ") " + item.getName());
            i++;
        }
    }
}