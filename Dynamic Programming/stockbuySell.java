public class stockbuySell {
    public static void main(String[] args) {
        int[] arr={7,1,3,5,2,8,4};
        findprofit(arr);
    }
    public static void findprofit(int[] arr){
        int n=arr.length;
        int profit=0;
        int min=arr[0];
        for(int i=1;i<n;i++){
            int cost=arr[i]-min;
            profit=Math.max(profit, cost);
            min=Math.min(min, arr[i]);//remembering the min value , so it's a dp problem
        }
        System.out.println(profit);
    }
}
