import java.util.Scanner;

public class Tomb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg, hogy mennyi eleme legyen a tömbnek: ");
        int hossz = sc.nextInt();
        int[] tomb = new int[hossz];
        for (int i = 0; i < hossz; i++){
            System.out.println("Add meg a tomb " + i + ". elemét: ");
            tomb[i] = sc.nextInt();
            
        }
        for (int i = 0; i < tomb.length; i++){

            System.out.println(tomb[i]);
        }
    }
}
