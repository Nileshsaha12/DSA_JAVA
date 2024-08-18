import java.util.*;
public class printNto1Backtrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        f(1,n);
    }
    public static void f(int i,int n){
        if(i>n) return;
        f(i+1,n);
        System.out.println(i);
    }
}
