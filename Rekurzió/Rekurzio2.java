public class Rekurzio2 {

    public static int hatvany(int alap, int kitevo)
    {
        if(kitevo != 0){
            return alap * hatvany(alap, kitevo - 1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int res = hatvany(2, 3);
        System.out.println(res);
    }
}
