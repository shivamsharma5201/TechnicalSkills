public class second_Largest {
    public static void main(String[] args) {
        int arr[] = {4,6,7,10,2,5};
        int max =arr[0];
        int second_max = arr[0];
        if(arr.length<=1){
            System.out.println("No such element");
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max =arr[i];
            }
            if(arr[i]>second_max && arr[i]<max){
                second_max = arr[i];
            }
        }
        System.out.println("Second MAx: "+second_max);
    }
}
