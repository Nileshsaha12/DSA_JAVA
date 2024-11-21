public class rearrangeArraybySigns {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,5,-1,-5,-6};
        //brute(arr);
        optimal(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int k=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos[k++]=arr[i];
            }else{
                neg[l++]=arr[i];
            }
        }
        for(int i=0;i<n/2;i++){
            arr[i*2]=pos[i];
            arr[i*2+1] = neg[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[neg]=arr[i];
                neg += 2;
            }else{
                ans[pos]= arr[i];
                pos+=2;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
