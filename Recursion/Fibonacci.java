public class Fibonacci {
    public static void main(String[] args) {
        int n=8;
        int res=f(n);
        System.out.println(res);
    }
    public static int f(int n){
        if(n<=1) return n;
        return f(n-1)+f(n-2);
    }
}
