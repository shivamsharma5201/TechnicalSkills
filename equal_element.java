public class equal_element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += (max - arr[i]);
        }
        System.out.print(time);        
    }
}
