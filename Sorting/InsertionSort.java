public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        InsertionS(arr);
        for(int n:arr) System.out.println(n);
    }
    public static void InsertionS(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
