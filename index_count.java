public class index_count{
    public static void main(String[] args) {
        int[] arr= {1,3,35,7,2,57};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(max !=arr[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}