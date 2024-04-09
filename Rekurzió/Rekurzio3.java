public class Rekurzio3 {

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        int res = fibonacci(6);
        System.out.println(res);
    }
}
