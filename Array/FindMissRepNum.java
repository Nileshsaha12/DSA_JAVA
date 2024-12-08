
public class FindMissRepNum {
    public static void main(String[] args) {
        int[] arr={4,3,6,2,1,1};
        //brute(arr);
        //better(arr);
        optimal1(arr);
    }
    public static void brute(int[] arr){
        int n=arr.length;
        int rep=Integer.MIN_VALUE;
        int miss=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    cnt++;
                }  
            }
            if(cnt==2) rep=i;
            if(cnt==0) miss=i;
        }
        System.out.println(rep+" "+miss);
    }
    public static void better(int[] arr){
        int n=arr.length;
        int[] ans=new int[n+1];
        for(int i=0;i<n;i++){
            ans[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(ans[i]==2) System.out.println(i);
            if(ans[i]==0) System.out.println(i);
        }
    }
    public static void optimal1(int[] arr){
        int n=arr.length;
        int sn=(n*(n+1))/2;
        int s2n=(n*(n+1)*(2*n+1))/6;
        int s=0;
        int s2=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+=(arr[i]*arr[i]);
        }
        int val1=s-sn;
        int val2=s2-s2n;
        int rem=val2/val1;
        int rep=(rem+val1)/2;
        int miss=rem-rep;
        System.out.println(rep+" "+miss);
    }
}
