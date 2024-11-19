public class MaxConOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,1,1,0,1,0,1,1,1,1,1,1};
        optimal(arr);
    }
    public static void optimal(int[] arr){
        int max=0;
        int c=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
                if(max<c) max=c;
            }
            else{
                c=0;
            }

        }
        System.out.println(max);
    }
}
