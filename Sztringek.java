import java.util.Scanner;

public class Sztringek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //bekérések
        System.out.println("Adj meg a vezetékneved!");
        String vezeteknev = scanner.nextLine();

        System.out.println("Adj meg egy keresztnevet! ");
        String keresztnev = scanner.nextLine();

        System.out.println("Adj meg egy születési helyet!");
        String szulhely = scanner.nextLine();

        System.out.println("Adj meg egy életkort!");
        int eletkor = scanner.nextInt();
        //Feladatok kiíratása
        String fullName = vezeteknev + " " + keresztnev;
        System.out.println(fullName.toUpperCase());

        System.out.println("A keresztnév ezen az indexen található:  " + fullName.indexOf(keresztnev)); 

        System.out.println(fullName.toLowerCase() + ", " + szulhely.toLowerCase());

        System.out.println("A felhasználó " + eletkor +" éves, a neve: "+ fullName+ " és itt született:  " + szulhely);

        System.out.println(keresztnev.startsWith("A") ? "'A' betűvel kezdődik a keresztnév": "Nem 'A' betűvel végződik a keresztnév.");

        System.out.println(vezeteknev.endsWith("t") ? "'t' betűvel végződik a vezetéknév" : "Nem 't' betűvel végződik a vezetéknév");

        System.out.println(fullName.length());

        System.out.println(fullName.replace("i", "y"));

        scanner.close();


    }
}
