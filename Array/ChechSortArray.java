

public class ChechSortArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5};
        if(brute(arr)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
    //This is the optimal approach with TC=O(n)
    public static boolean brute(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }
    
}
