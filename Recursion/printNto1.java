import java.util.*;

public class printNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1(n,n);
        sc.close();
    }
    public static void print1(int i,int n){
        if(i<1) return;
        System.out.println(i);
        print1(i-1,n);
    }
}
