public class MetodusokDolgozat2 {

    public static int masodfokuMegoldasSzam(double a, double b, double c) {
        if (a == 0) {
            return -1;
        }
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return 2;
        }
        else if (d == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static boolean vanKisbetu(String szoveg){
        for (int i = 0; i < szoveg.length(); i++) {
            if (Character.isLowerCase(szoveg.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static String getMeret(int meret){
        if (meret < 150){
            return "XS";
        }
        else if(meret >= 150 && meret < 160){
            return "S";
        }
        else if(meret >= 160 && meret < 170){
            return "M";
        }
        else if(meret >= 170 && meret < 180){
            return "L";
        }
        else if(meret >= 180 && meret < 190){
            return "XL";
        }
        return "XXL";
    }

    public static String rubikKockaSzin(int num){
        switch(num){
            case 1: return "yellow";
            case 2: return "red";
            case 3: return "orange";
            case 4: return "white";
            case 5: return "blue";
            case 6: return "green";
        }
        return "invalid parameter";
    }
    public static void main(String[] args) {
        
       System.out.println(masodfokuMegoldasSzam(0, 6, 5) == -1);
       System.out.println(masodfokuMegoldasSzam(0, 1, 1) == -1);
       System.out.println(masodfokuMegoldasSzam(1, 3, 4)== 0);
       System.out.println(masodfokuMegoldasSzam(2, 4, 3)== 0);
       System.out.println(masodfokuMegoldasSzam(2, -4, 2)== 1);
       System.out.println(masodfokuMegoldasSzam(1, -2, 1)== 1);
       System.out.println(masodfokuMegoldasSzam(1, 0, -4)== 2);
       System.out.println(masodfokuMegoldasSzam(2, 2, -2)== 2);
       System.out.println(vanKisbetu("alma") == true);
       System.out.println(vanKisbetu("ALmA") == true);
       System.out.println(vanKisbetu("ALMA") == false);
       System.out.println(vanKisbetu("") == false);
       System.out.println(vanKisbetu("123456") == false);
       System.out.println(getMeret(100) == "XS");
       System.out.println(getMeret(150) == "S");
       System.out.println(getMeret(156) == "S");
       System.out.println(getMeret(160) == "M");
       System.out.println(getMeret(166) == "M");
       System.out.println(getMeret(170) == "L");
       System.out.println(getMeret(176) == "L");
       System.out.println(getMeret(180) == "XL");
       System.out.println(getMeret(186) == "XL");
       System.out.println(getMeret(190) == "XXL");
       System.out.println(getMeret(200) == "XXL");
       System.out.println(rubikKockaSzin(1) == "yellow");
       System.out.println(rubikKockaSzin(2) == "red");
       System.out.println(rubikKockaSzin(3) == "orange");
       System.out.println(rubikKockaSzin(4) == "white");
       System.out.println(rubikKockaSzin(5) == "blue");
       System.out.println(rubikKockaSzin(6) == "green");
       System.out.println(rubikKockaSzin(7) == "invalid parameter");
       System.out.println(rubikKockaSzin(-1) == "invalid parameter");

    }
}
