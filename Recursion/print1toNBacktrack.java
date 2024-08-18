import java.util.*;
public class print1toNBacktrack {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    f(n,n);
    sc.close();
}
public static void f(int i,int n){
    if(i<1)return;
    f(i-1,n);
    System.out.println(i);
}
    
}
