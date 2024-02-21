import java.util.Scanner;
public class IFFeladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szam1 = scanner.nextInt();
        System.out.print("Adj meg egy számot: ");
        int szam2 = scanner.nextInt();

        if(szam1 > szam2){
            System.out.println("A nagyobb szám az első megadott szám > " + szam1);
        }
        else if(szam1 < szam2){
            System.out.println("A nagyobb szám a második megadott szám. > " + szam2);
        }
        else{
            System.out.println("A két szám egyenlő");
        }

        scanner.close();
    }
}   
