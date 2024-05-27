import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DataStructuresDolgozat {

    public static void ujElemHozzaadasa(LinkedList<String> fovarosok, String varos){
        fovarosok.add(varos);
    }

    public static void torolElemet(LinkedList<String> fovarosok, String varos){
        fovarosok.remove(varos);
    }

    public static void fovarosOrszaga(HashMap<String, String> parok, String varos){
        String orszag = parok.get(varos);
        if (orszag != null) {
            System.out.println("A(z) " + varos + " fővárosa " + orszag);
        } else {
            System.out.println(varos + " nem található az adatok között.");
        }
    }

    public static void ujFovarosOrszagPar(HashMap<String, String> parok, String varos, String orszag){
        parok.put(varos, orszag);
    }

     public static void torolAdatPart(Map<String, String> countries, String capital) throws IllegalArgumentException {
        if (countries.containsKey(capital)) {
            countries.remove(capital);
        } else {
            throw new IllegalArgumentException("Nincs " + capital + " főváros az adatok között");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> fovarosok = new LinkedList<>();
        fovarosok.add("Wien");
        fovarosok.add("Budapest");
        fovarosok.add("Prag");
        fovarosok.add("Bratislava");
        System.out.println("1: ");
        for(int i = 0; i < fovarosok.size(); i++){
            System.out.println(fovarosok.get(i));
        }

        ujElemHozzaadasa(fovarosok, "Ljubljana");
        ujElemHozzaadasa(fovarosok, "Sarajevo");
        ujElemHozzaadasa(fovarosok, "Zagreb");

        System.out.println("\n2:");
        for(int i = 0; i < fovarosok.size(); i++){
            System.out.println(fovarosok.get(i));
        }

        System.out.println("\n3:");
        torolElemet(fovarosok, "Sarajevo");
        for(int i = 0; i < fovarosok.size(); i++){
            System.out.println(fovarosok.get(i));
        }

        System.out.println("\n4:");
        HashMap<String, String> parok = new HashMap<>();
        parok.put("Wien", "Österreich");
        parok.put("Budapest", "Magyarország");
        parok.put("Ljubljana", "Slovenija");

        for (String varos : parok.keySet()) {
            System.out.println(varos + ": " + parok.get(varos));
        }

        System.out.println("\n5:");
        fovarosOrszaga(parok, "Budapest");
        fovarosOrszaga(parok, "Zagreb");

        System.out.println("\n6:");
        ujFovarosOrszagPar(parok, "Zagreb", "Hrvatska");
        for (String varos : parok.keySet()) {
            System.out.println(varos + ": " + parok.get(varos));
        }

        System.out.println("\n7:");
        torolAdatPart(parok, "Ljubljana");
        for (String varos : parok.keySet()) {
            System.out.println(varos + ": " + parok.get(varos));
        }

        System.out.println("\n8:");
        torolAdatPart(parok, "Prag");
        for (String varos : parok.keySet()) {
            System.out.println(varos + ": " + parok.get(varos));
        }
    }
}
