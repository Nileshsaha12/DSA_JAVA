import java.util.Arrays;

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr={5,4,6,36,92,63,608,999};
       
        //System.out.println(Brute(arr));
       // System.out.println(Better(arr));
        System.out.println(optimal(arr));
    }
    //this is a brute force approach with TC=O(nlogn+n)
    public static int Brute(int[] arr){
        Arrays.sort(arr);
        int n=arr.length-1;
        int largest=arr[n];
        int slargest=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i] !=largest) 
            {
                slargest=arr[i];
                break;
            }
        }
        return slargest;
    }
    //This is a better approach with TC=O(n+n)
    public static int Better(int[] arr){
        int n=arr.length-1;
        int largest=arr[0];
        for(int i=0;i<n+1;i++){
            if(arr[i]>largest) largest=arr[i];
        }
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            if(arr[i]>slargest && arr[i] != largest) slargest=arr[i];
        }
        return slargest;
    }
    //This is a optimal approach with TC=O(n)
    public static int optimal(int[] arr){
        int n=arr.length-1;
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<n+1;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]<largest) {
                slargest=arr[i];
            }
        }
        return slargest;
    }
}