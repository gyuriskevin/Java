import java.util.Scanner;

public class Osszesen {

    public static int getOsszeg(int szam){
        int osszeg = 0;
        for(int i = 0; i < szam; i++){
            osszeg += i;
        }
        return osszeg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        int szam = sc.nextInt();
        System.out.println( getOsszeg(szam));

        sc.close();
    }
}
