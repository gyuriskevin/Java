import java.util.Scanner;

public class SzovegesErtekeles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg jegyet!");
        int jegy = sc.nextInt();

        switch(jegy){
            case 1:
                System.out.println("A megadott jegy egyes.");
                break;
            case 2:
                System.out.println("A megadott jegy kettes.");
                break;
            case 3:
            System.out.println("A megadott jegy hármas.");
            break;
            case 4:
            System.out.println("A megadott jegy négyes.");
            break;
            case 5:
            System.out.println("A megadott jegy ötös.");
            break;
            default: 
            System.out.println("A megadott szám nem jegy!");
            sc.close();
        }
    }
}
