public class MakeMatrixZeros {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
        //brute(arr);
        //better(arr);
        optimal(arr);
    }

    public static void brute(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    makeZero(arr, i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void makeZero(int[][] arr, int x, int y) {
        int n = arr.length;
        int m = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i][y] == 1) {
                arr[i][y] = -1;
            }
        }
        for (int j = 0; j < m; j++) {
            if (arr[x][j] == 1) {
                arr[x][j] = -1;
            }
        }
    }
    public static void better(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
 
        }
        for(int[] num:arr){
            for(int i:num){
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }
    public static void optimal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j != 0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j] != 0){
                    if(arr[0][j]==0 || arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0) {
            for(int j=0;j<m;j++){
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
