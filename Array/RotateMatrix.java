public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //brute(arr);\
        optimal(arr);
    }
    public static void brute(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][(n-1)-i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void optimal(int[][] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int[] a:arr){
            rotate(a);
        }
        for(int[] a:arr){
           for(int num:a){
            System.out.print(num + " ");
           }
           System.out.println();
        }
    }
    public static void rotate(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
}
