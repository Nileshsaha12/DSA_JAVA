/**
 * InnerPrintName
 */
import java.util.*;
public class InnerPrintName {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printname(1,n);
}

public static void printname(int i,int n){
    if(i>n) return;
    System.out.println("Nilesh");
    
    printname(i+1,n);
}
    
}

