import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Add meg a mátrix 1. méretét!");
        int len1 = sc.nextInt();
        System.out.println("Add meg a mátrix 2. méretét!");
        int len2 = sc.nextInt();

        int[][] sor = new int[len1][len2];

        for(int i = 0;i< len1; i++){
            for(int j = 0;  j < len2; j++){
                sor[i][j] = i*i;
            }
        }
        for (int i = 0; i<len1; i++) {
            for (int j = 0; j<len2; j++) {
                System.out.print(sor[i][j]);
            }
            System.out.println();
        }

    }
}
