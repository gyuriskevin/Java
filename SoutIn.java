import java.util.Scanner;

public class SoutIn {
    public static void main(String[] args) {
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;

        System.out.println(msg + " " + a);
        System.out.println(msg + " " + o);
        System.out.println(msg + " " + h);
        System.out.println(msg + " " + d);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kedvenc zeneszáma: ");
        String zene = scanner.nextLine();

        System.out.print("Kedvenc étele: ");
        String etel = scanner.nextLine();

        System.out.print("Kedvenc hobbija: ");
        String hobbim = scanner.nextLine();

        System.out.print("Kedvenc filmje: ");
        String film = scanner.nextLine();

        System.out.print("Kedvenc uticélja: ");
        String uticel = scanner.nextLine();
        System.out.println("A kedvenc zeneszámod: " + zene);
        System.out.println("A kedvenc ételed: " + etel + ", hobbid: " + hobbim + ".");
        System.out.println("Kedvenc filmed: " + film);
        System.out.println("Uticélod: " + uticel);
        
        scanner.close();
    }
}