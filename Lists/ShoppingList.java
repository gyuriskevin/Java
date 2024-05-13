import java.util.LinkedList;

public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.

    public static String getMilk(LinkedList<String> ShoppingList){
        return ShoppingList.contains("milk") ? "yes" : "no";
    }

    public static String getBanana(LinkedList<String> ShoppingList){
        return ShoppingList.contains("banana") ? "yes" : "no";
    }
    

    public static void main(String[] args) {
        LinkedList<String> ShoppingList = new LinkedList<>();
        ShoppingList.add("eggs");
        ShoppingList.add("milk");
        ShoppingList.add("fish");
        ShoppingList.add("apples");
        ShoppingList.add("bread");
        ShoppingList.add("chicken");

        System.out.println(getMilk(ShoppingList));
        System.out.println(getBanana(ShoppingList));
    }

}
