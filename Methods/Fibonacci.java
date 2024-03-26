public class Fibonacci {

    public static int getFibonacci(int szam) {
        if (szam <= 0)
            return 0;
        else if (szam == 1)
            return 1;

        int[] szamok = new int[szam + 1];
        szamok[0] = 0;
        szamok[1] = 1;

        for (int i = 2; i <= szam; i++) {
            szamok[i] = szamok[i - 1] + szamok[i - 2];
        }

        return szamok[szam];
    }

    public static void main(String[] args) {
        int n = 18;
        int fibonacciNumber = getFibonacci(n);
        System.out.println(n +". elem: " + fibonacciNumber);
    }
}
