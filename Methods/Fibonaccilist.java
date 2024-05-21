import java.util.ArrayList;
import java.util.List;

public class Fibonaccilist {

    public static void main(String[] args) {
        // Test cases
        System.out.println(fibonacci(4));  
        System.out.println(fibonacci(10)); 
        System.out.println(fibonacci(-1)); 
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();

        if (n <= 0) {
            return result; 
        }

        result.add(0);
        if (n > 1) {
            result.add(1);
        }


        for (int i = 2; i < n; i++) {
            int nextValue = result.get(i - 1) + result.get(i - 2);
            result.add(nextValue);
        }

        return result;
    }
}
