public class Whiles {
    public static void main(String[] args) {
        int szam1 = (int) (Math.random() * 100);
        int szam2 = (int) (Math.random() * 100);

        int kisebb = 0;
        int nagyobb = 0;
        if (szam1 > szam2) {
            kisebb = szam2;
            nagyobb = szam1;
        } else {
            kisebb = szam1;
            nagyobb = szam2;
        }

        int i = kisebb;
        int sor = 0;
        while (i < nagyobb) {
            System.out.print(i + " ");
            sor++;
            if(sor == 10){
                System.out.println();
                sor = 0;
            }
            i++;
        }
        System.out.println();
        System.out.println("\nDo-While\n");
        i = kisebb;
        sor = 0;
        do{
            System.out.print(i + " ");
            sor++;
            if(sor == 10){
                System.out.println();
                sor = 0;
            }
            i++;
        }while(i < nagyobb);

    }
}
