public class Rekurzio1 {

    public static int fakt(int num){
        if(num != 0){
            return num * fakt(num -1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int result = fakt(5);
        System.out.println(result);
    }
}
