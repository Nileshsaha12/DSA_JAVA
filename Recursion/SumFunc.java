import java.util.*;

public class SumFunc {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum= sum2(n);
    System.out.println(sum);
    sc.close();
}
    
public static int sum2(int n){
    if(n==0) {
        return 0;
    }
    return n+sum2(n-1);
}

}
