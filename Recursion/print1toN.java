import java.util.*;
public class print1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        printn(1,n);
        sc.close();
    }
    public static void printn(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printn(i+1, n);
    }
}
