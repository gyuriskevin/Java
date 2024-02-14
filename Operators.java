import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kérem, adjon meg egy sztringet:");
        String inputString = scanner.nextLine();

        System.out.println("Kérem, adjon meg két karaktert:");
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(1);

        System.out.println("Kérem, adjon meg két egész számot:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println("Kérem, adjon meg két tizedes számot:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        String concatenatedString = inputString + char1 + char2;
        double divisionResult = (double) int1 / int2;
        double sumOfDoubles = double1 + double2;
        double subtractionResult = int1 - double2;
        double multiplicationResult = int2 * double1;

        
        System.out.println("A sztringhez hozzáadva a két karakter: " + concatenatedString);
        System.out.println("Az egész számok osztása: " + divisionResult);
        System.out.println("A két tizedes szám összege: " + sumOfDoubles);
        System.out.println("Az egyik egész számból kivonva a tizedes számot: " + subtractionResult);
        System.out.println("A másik egész szám és a tizedes szám szorzata: " + multiplicationResult);
        
        scanner.close();
    }
}
