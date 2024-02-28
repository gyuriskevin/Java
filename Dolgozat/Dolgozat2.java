import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        System.out.println("Add meg a kör sugarát: ");
        Scanner sc = new Scanner(System.in);
        double sugar = sc.nextDouble();

        double terulet = Math.pow(sugar, 2) *Math.PI;
        
        System.out.println("A terület: " + terulet +" A kerekített terület: "+Math.round(terulet));
    }
}
