import java.util.*;

public class Candyshop {
    public static void main(String... args) {
        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

        // Call the repairSweetList method and print the result
        System.out.println(repairSweetList(sweets));
    }

    public static ArrayList<Object> repairSweetList(ArrayList<Object> sweets) {
        // Iterate over the list and replace the incorrect items
        for (int i = 0; i < sweets.size(); i++) {
            if (sweets.get(i).equals(2)) {
                sweets.set(i, "Croissant");
            } else if (sweets.get(i).equals(false)) {
                sweets.set(i, "Ice cream");
            }
        }
        return sweets;
    }
}
