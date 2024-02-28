import java.util.Scanner;

public class Dolgozat1 {
    public static void main(String[] args) {
        System.out.println("Adj meg egy nevet: ");

        Scanner sc = new Scanner(System.in);
        String nev = sc.nextLine();
        System.out.println("Hello " + nev + "!");
        sc.close();
    }
}
