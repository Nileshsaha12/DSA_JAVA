public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,5,63,36,64,6,7,9};
        int n=arr.length-1;
        quciksort(arr,0,n);
        for(int nm:arr) {
            System.out.println(nm);
        }
    }
    public static void quciksort(int[] arr,int low,int high){
        if(low<high){
        int partiIndex= partitionIdx(arr,low,high);
        quciksort(arr, low, partiIndex-1);
        quciksort(arr, partiIndex+1, high);
        }
    }
    public static int partitionIdx(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
                
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
           if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
