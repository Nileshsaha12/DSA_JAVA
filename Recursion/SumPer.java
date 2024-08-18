import java.util.*;

public class SumPer{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sum1(n,0);
    sc.close();
}
    
public static void sum1(int n,int sum){
    if(n<1) {
        System.out.println(sum);
        return;
    }
    sum1(n-1,sum+n);
}
}