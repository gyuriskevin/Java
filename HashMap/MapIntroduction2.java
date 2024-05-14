import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        // Create a map where the keys are strings and the values are strings
        // with the following initial values
        // 978-1-60309-452-8 : A Letter to Jo, 978-1-60309-459-7 : Lupus
        // 978-1-60309-444-3 : Red Panda and Moon Bear, 978-1-60309-461-0 : The Lab
        HashMap<String, String> map = new HashMap<>();
        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");

        // Print all the key-value pairs
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }

        // Remove the key-value pair with key "978-1-60309-444-3"
        map.remove("978-1-60309-444-3");

        // Remove the key-value pair with value "The Lab"
        map.values().removeIf(value -> value.equals("The Lab"));

        // Add the following key-value pairs to the map
        // 978-1-60309-450-4 : They Called Us Enemy, 978-1-60309-453-5 : Why Did We Trust Him?
        map.put("978-1-60309-450-4", "They Called Us Enemy");
        map.put("978-1-60309-453-5", "Why Did We Trust Him?");

        // Print whether there is an associated value with key "478-0-61159-424-8" or not
        System.out.println(map.containsKey("478-0-61159-424-8"));

        // Print the value associated with key "978-1-60309-453-5"
        System.out.println(map.get("978-1-60309-453-5"));
    }
}


    // Output:
    //    A Letter to Jo (ISBN: 978-1-60309-452-8)
    //    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    //    Lupus (ISBN: 978-1-60309-459-7)
    //    The Lab (ISBN: 978-1-60309-461-0)
    //    false
    //    Why Did We Trust Him?
