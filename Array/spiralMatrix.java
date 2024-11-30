import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 20, 21, 22, 23, 24, 7 }, { 19, 32, 33, 34, 25, 8 },
                { 18, 31, 36, 35, 26, 9 }, { 17, 30, 29, 28, 27, 10 }, { 16, 15, 14, 13, 12, 11 } };
        optimal(arr);
    }

    public static void optimal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        List<Integer> st=new ArrayList<>(n);
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                st.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                st.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                st.add(arr[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                st.add(arr[i][left]);
            }
            left++;
        }
    }
        for (Integer integer : st) {
            System.out.print(integer + " ");
        }
        System.out.println();
     }
}
