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
