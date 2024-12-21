public class sqrtBS {
    public static void main(String[] args) {
        int n=28;
        //int res=brute(n);
        int res=optimal(n);
        System.out.println(res);
    }
    public static int brute(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            if((i*i)<=n){
                res=i;
            }else{
                break;
            }
        }
        return res;
    }
    public static int optimal(int n){
        int low=1;
        int high=n;
        int res=1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid*mid)<=n){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
}
