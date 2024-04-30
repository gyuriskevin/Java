public class MasodfokuHiba {

    public static int masodfokuMegoldasokSzama(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("Nem másodfokú az egyenlet");
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
    
    public static void masodfokuGyokok(double a, double b, double c) {
        try {
            int megoldasokSzama = masodfokuMegoldasokSzama(a, b, c);
            switch (megoldasokSzama) {
                case 2:
                    double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                    double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                    System.out.println("Két megoldás van:");
                    System.out.println("x1 = " + x1 + ", x2 = " + x2);
                    break;
                case 1:
                    double x = -b / (2 * a);
                    System.out.println("Egy megoldás van:");
                    System.out.println("x = " + x);
                    break;
                case 0:
                    System.out.println("Nincs megoldás.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        masodfokuGyokok(1, 0, -4);
    }
}
