public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int max = arr[0];
        int max2 = arr[1];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < max && arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println(max2);

    }
}
