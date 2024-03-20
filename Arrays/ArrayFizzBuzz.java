public class ArrayFizzBuzz {
    public static void main(String[] args) {
        String[] fizzBuzz = new String[100];

        for(int i = 0; i < fizzBuzz.length; i++){
            if( i % 3 == 0 && i % 5 != 0){
                fizzBuzz[i] = "Fizz";
            }
            else if( i % 3 != 0 && i % 5 == 0){
                fizzBuzz[i] = "Buzz";
            }
            else if ( i % 3 == 0 && i % 5 == 0){
                fizzBuzz[i] = "FizzBuzz";
            }
            else{
                fizzBuzz[i] = Integer.toString(i);
            }
        }
        int c = 0;
        for(int i = 0; i < fizzBuzz.length; i++){
            if (c<15){
                System.out.print(fizzBuzz[i] +", ");
                c++;
            }
            else{
                System.out.println();
                c = 0;
            }
        }
    }
}
