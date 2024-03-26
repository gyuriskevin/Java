public class Fibonacci {

    public static int getFibonacci(int szam) {
        int[] szamok = new int[szam + 1];
        szamok[0] = 0;
        szamok[1] = 1;

        for (int i = 2; i <= szam; i++) {
            szamok[i] = szamok[i - 1] + szamok[i - 2];
        }

        return szamok[szam - 1];
    }

    public static void main(String[] args) {
        int n = 18;
        int fibonacciNumber = getFibonacci(n);
        System.out.println(n +". elem: " + fibonacciNumber);
    }
}


/// Tomb nelkul

public class Fibonacci2 {

    public static int getFibonacci(int szam) {

        int num1= 0;
        int num2= 1;
        int res = 0;

        for (int i = 3; i <= szam; i++) {
           res = num1 + num2;
           num1 = num2;
           num2 = res;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 7;
        int fibonacciNumber = getFibonacci(n);
        System.out.println(n +". elem: " + fibonacciNumber);
    }
}
