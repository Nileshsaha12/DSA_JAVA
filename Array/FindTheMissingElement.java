

public class FindTheMissingElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,7};
        int n=8;
        //brute(arr);
        //better(arr);
        //optimal1(arr,n);
        optimal2(arr,n);

    }
    public static void brute(int[] arr){
        int n=arr.length;
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0) System.out.println(i);
        }
    }
    public static void better(int[] arr){
        int n=arr.length+1;
        int[] res=new int[n+1];        
        for(int i=0;i<n-1;i++){
            res[arr[i]]=1;
        }
       
        for(int i=1;i<=n;i++){
            if(res[i]==0) System.out.println(i);
        }
    }
    public static void optimal1(int[] arr,int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n-1;i++){
            s2+=arr[i];
        }
        System.out.println(sum-s2);
    
    }
    public static void optimal2(int[] arr,int n){
        int xor1=0;
        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
        }
        System.out.println(xor1^xor2);
    }
}
