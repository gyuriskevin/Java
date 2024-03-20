public class ArraysMerging {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arr2 = { 10, 324, 45, 90, 9808 };
        int[] merged_arr = new int[arr.length + arr2.length];

        System.arraycopy(arr, 0, merged_arr, 0, arr.length);
        System.arraycopy(arr2, 0, merged_arr, arr.length, arr2.length);

        for(int i = 0; i < merged_arr.length; i++){
            System.out.println(merged_arr[i]);
        }
    }
}
