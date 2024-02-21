public class Matek {
    public static void main(String[] args) {
        int elsoSzam = (int)(Math.random() * 201);
        int masodikSzam = (int)(Math.random() * 201);
        System.out.println(elsoSzam > masodikSzam ? "A nagyobb szám: " + elsoSzam : "A nagyobb szám: " + masodikSzam);
        System.out.println(elsoSzam < masodikSzam ? "A kisebb szám: " + elsoSzam : "A kisebb szám: " + masodikSzam);
        double elsoSzamGyok = Math.sqrt(elsoSzam);
        double masodikSzamGyok = Math.sqrt(masodikSzam);
        double osszGyok = Math.sqrt(elsoSzam + masodikSzam);
        System.out.println("Az első szám négyzetgyöke: " + elsoSzamGyok);
        System.out.println("A második szám négyzetgyöke: " + masodikSzamGyok);
        System.out.println("A két szám négyzetgyöke: " + osszGyok);

        int eltérés = Math.abs(elsoSzam - masodikSzam);
        System.out.println("A két szám közötti eltérés: " + eltérés);

        double elsoSzamKob = Math.pow(elsoSzam, 3);
        double masodikSzamKob = Math.pow(masodikSzam, 3);
        System.out.println("Az első szám köbe: " + elsoSzamKob);
        System.out.println("A második szám köbe: " + masodikSzamKob);

        double hanyados = (double)elsoSzam / masodikSzam;
        System.out.println("A két szám hányadosának legközelebbi egészre kerekítése: " + Math.round(hanyados));
        System.out.println("A két szám hányadosának lefele kerekítése: " + Math.floor(hanyados));
        System.out.println("A két szám hányadosának felfelé kerekítése: " + Math.ceil(hanyados));
    }
}
