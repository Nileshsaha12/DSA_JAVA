import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
       // findValue(5,3);//If the row and column number are given then find out the value at that place
        //printNth(n); // print the nth row
        printAll(n);//print the entire triangle
    }
    public static void findValue(int r,int c){
        int value=1;
        for(int i=1;i<c;i++){  
            value  = value *(r-i);
            value = value / i;
        }
        System.out.println(value);
    }
    public static void printNth(int n){
        int val=1;
        System.out.println(val);
        for(int i=1;i<n;i++){
           val = val * (n-i);
           val=val/i;
           System.out.println(val);
        }
    }
    public static void printAll(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(generateRow(i));
        }
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        System.out.println();
    }
    public static List<Integer> generateRow(int n){
        List<Integer> rows=new ArrayList<>();
        int val=1;
        rows.add(val);
        for(int i=1;i<n;i++){
            val=val*(n-i);
            val=val/i;
            rows.add(val);
        }
        return rows;
    }
}
