

import java.util.Arrays;

public class LargestEle {
    public static void main(String[] args) {
        int[] arr={3,4,5,9,3,6,2,6};
       // System.out.println(Brute(arr));
       System.out.println(optimal(arr));
    }
    //This is a brute force approach which takes TC=O(nlogn) and sc=O(1)
    public static int Brute(int[] arr){
        Arrays.sort(arr);
        int n=arr.length-1;
        return arr[n];
    }
    //This is a optimal approach where TC=O(n) and SC=O(1)
    public static int optimal(int[] arr){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(large<arr[i]) large=arr[i];
        }
        return large;
    }
}
