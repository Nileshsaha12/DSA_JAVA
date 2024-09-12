import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4,4,4,4,9,9};
       //Brute(arr);
       optimal(arr);
    }
    //This is a brute force approach with TC=O(nlogn+n) and SC=O(n)
    public static void Brute(int[] arr){
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int idx=0;
        for (Integer i : st) {
            arr[idx]=i;
            idx++;
        }
        for(int i=0;i<idx;i++){
            System.out.println(arr[i]);
        }
       
    }
    // This is a optimal approach with TC=O(n) and SC=O(1)
    //This will only work if and only if the array is sorted...
    public static void optimal(int[] arr){
        int i=0;
        int j=1;
        int n=arr.length;
        while(j<n){
            if(arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        for(int k=0;k<i+1;k++){
            System.out.println(arr[k]);
        }
    }
}
