import java.util.Scanner;
public class IFFeladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérj be az első számot: ");
        int szam1 = scanner.nextInt();
        System.out.print("Kérj be a második számot: ");
        int szam2 = scanner.nextInt();
        System.out.print("Kérj be a harmadik számot: ");
        int szam3 = scanner.nextInt();

        
        if (szam1 > szam2 && szam1 > szam3) {
            System.out.println("A három szám közül a legnagyobb: " + szam1);
            if (szam2 > szam3) {
                System.out.println("A három szám közül a középső: " + szam2);
                System.out.println("A három szám közül a legkisebb: " + szam3);
            } else {
                System.out.println("A három szám közül a középső: " + szam3);
                System.out.println("A három szám közül a legkisebb: " + szam2);
            }
        } else if (szam2 > szam1 && szam2 > szam3) {
            System.out.println("A három szám közül a legnagyobb: " + szam2);
            if (szam1 > szam3) {
                System.out.println("A három szám közül a középső: " + szam1);
                System.out.println("A három szám közül a legkisebb: " + szam3);
            } else {
                System.out.println("A három szám közül a középső: " + szam3);
                System.out.println("A három szám közül a legkisebb: " + szam1);
            }
        } else {
            System.out.println("A három szám közül a legnagyobb: " + szam3);
            if (szam1 > szam2) {
                System.out.println("A három szám közül a középső: " + szam1);
                System.out.println("A három szám közül a legkisebb: " + szam2);
            } else {
                System.out.println("A három szám közül a középső: " + szam2);
                System.out.println("A három szám közül a legkisebb: " + szam1);
            }
        }

        

        scanner.close();
    }
}
