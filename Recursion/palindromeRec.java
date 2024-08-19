public class palindromeRec {
    public static void main(String[] args) {
        String s="nilesh";
    boolean b=f(s,0);
    if(b) 
    System.out.println("pailndrome");
    else System.out.println("Not palindrome");
    }
    public static boolean f(String s,int i){
        int n=s.length();
        if(i>=n/2) return true;
        if(s.charAt(i) !=s.charAt(n-i-1)) return false;
        f(s,i+1);
        return true;
    }

}


