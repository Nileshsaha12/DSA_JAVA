import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=factorial1(n);
        System.out.println(res);
        sc.close();
    }
    public static int factorial1(int n){
        if(n==1) return 1;
        return n*factorial1(n-1); 
    }
}
