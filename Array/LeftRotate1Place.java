public class LeftRotate1Place {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Optimal(arr);
    }
    //This is a optimal approach with TC=O(n) and SC=O(1)
    public static void Optimal(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
