public class revArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n=arr.length-1;
        reversearr(n,arr);

    }
    public static void reversearr(int i,int[] arr){
        
        if(i<0) return;
        System.out.println(arr[i]);
        reversearr(i-1,arr);
    }
}
