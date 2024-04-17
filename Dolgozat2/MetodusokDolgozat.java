public class MetodusokDolgozat {

    public static int signOfTheNumber(int x){
        if(x > 0) {
            return 1;
        }
        else if(x < 0){
            return -1;
        }
        else if (x == 0){
            return 0;
        }
        return 0;
    }

    public static String twoParameters(String x, String y){
        return "First parameter:" + x + " Second parameter: " + y;
    }

    public static String twoParameters(String x, int y){
        return "First parameter:" + x + " Second parameter: " + y;
    }

    public static String twoParameters(int x, String y){
        return "First parameter:" + x + " Second parameter: " + y;
    }

    public static String twoParameters(int x, int y){
        return "First parameter:" + x + " Second parameter: " + y;
    }

    public static double triangleArea(int a, int b, int c){
        double s = (a + b + c) / 2;
        double T = Math.sqrt(s * (s - a )* (s - b) * (s - c));
        if(a + b > c && a + c > b && b + c > a){
            return T;
        }
        return -1;
    }

    public static String secondDegreeFunction(double a, double b, double c){
        double gyokAlatti = b * b - 4 *a * c;
        double x1 = -b + Math.sqrt(gyokAlatti) / 2;
        double x2 = -b - Math.sqrt(gyokAlatti) / 2;

        if(a == 0){
            return "Nem másodfokú a függvény!";
        }
        else if(gyokAlatti < 0){
            return "Nincs valós megoldás";
        }
        else{
            return "x1 = " +x1 + ", x2 = " + x2;
        }


    }

    public static void main(String[] args) {
       System.out.println(signOfTheNumber(10));
       System.out.println(signOfTheNumber(1));
       System.out.println(signOfTheNumber(0));
       System.out.println(signOfTheNumber(-10));
        System.out.println(signOfTheNumber(-1));

        System.out.println(twoParameters(2, 3));
        System.out.println(twoParameters("2", 3));
        System.out.println(twoParameters(2, "3"));    
        System.out.println(twoParameters("2", "3"));    
        System.out.println(twoParameters(4, 5));    
        System.out.println(twoParameters("4", 5));    
        System.out.println(twoParameters(4, "5"));    
        System.out.println(twoParameters("4", "5"));   
        
        System.out.println(triangleArea(3, 4, 0));
        System.out.println(triangleArea(0, 1, 0));
        System.out.println(triangleArea(3, 4, 5));
        System.out.println(triangleArea(4, 6, 8));
        System.out.println(triangleArea(3, 4, 7));
        System.out.println(triangleArea(1, 2, 4));

        System.out.println(secondDegreeFunction(0, 6, 5));
        System.out.println(secondDegreeFunction(0, 1, 1));
        System.out.println(secondDegreeFunction(1, 3, 4));
        System.out.println(secondDegreeFunction(2, 4, 3));
        System.out.println(secondDegreeFunction(2, -4, 2));
        System.out.println(secondDegreeFunction(1, 0, -4));
    }
}
