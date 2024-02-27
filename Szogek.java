import java.util.Scanner;

public class Szogek {
    public static void main(String[] args) {
        System.out.println("Adj meg egy szöget: ");
        Scanner sc = new Scanner(System.in);
        int szog = sc.nextInt();
        while(szog > 360){

            szog = szog - 360;
        }
        
        switch(szog){
            case 0: 
                System.out.println("Nullszög!"); 
                break;
            case 90: System.out.println("Derékszög!"); break;
            case 180: System.out.println("Egyenesszög!"); break;
            case 360: System.out.println("Teljesszög!"); break;
        }
        if(0 < szog && 90 > szog){
            System.out.println("Hegyesszög!");
        }
        else if(90 < szog && 180 > szog){
            System.out.println("Tompaszög!");
        }
        else if(180 < szog && 360 > szog){
            System.out.println("Homorúszög!");
        }
sc.close();
    }
}
