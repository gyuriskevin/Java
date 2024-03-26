public class Faktorialis {

    public static int getFaktorialis(int szam){
        int osszeg = 1;
        for(int i = 1; i < szam +1; i++){
            osszeg *= i;
        }
        return osszeg;  
    }
    
    public static void main(String[] args) {
        int a = getFaktorialis(5);
        System.out.println(a);
    }
}
