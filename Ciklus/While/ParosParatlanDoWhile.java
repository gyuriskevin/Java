import java.util.Scanner;

public class ParosParatlanDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adj meg egy számot: ");
        int szam = sc.nextInt();


        do{
            if(szam % 2 == 0){
                System.out.println("A megadott szám páros!");
            }
            else{
                System.out.println("A megadott szám páratlan!");
            }
            System.out.print("Adj meg egy számot: ");
            szam = sc.nextInt();
        }while(szam > 0);

        
    }
}
