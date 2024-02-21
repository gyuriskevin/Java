import java.util.Scanner;

public class IFFeladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy magasságot: ");
        int magassag = scanner.nextInt();

        if (magassag >= 150 && magassag <= 165) {
            System.out.println("A méret: S");
        } else if (magassag > 165 && magassag <= 175) {
            System.out.println("A méret: M");
        } else if (magassag > 175 && magassag <= 185) {
            System.out.println("A méret: L");
        } else if (magassag > 185 && magassag <= 195) {
            System.out.println("A méret: XL");
        } else {
            System.out.println("NO SIZE: eltérő méret");
        }
        scanner.close();
    }
}
