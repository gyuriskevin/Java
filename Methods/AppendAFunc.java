public class AppendAFunc {

    public static String[] appendA(String[] tomb){
        for(int i = 0; i < tomb.length; i++){
            tomb[i] = tomb[i] + "a";
        }
        return tomb;
    }
    public static void main(String[] args) {
        
        String[] tomb = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};

        tomb = appendA(tomb);
        for(int i = 0; i < tomb.length; i++){
            System.out.println(tomb[i]);
        }
    }
}
