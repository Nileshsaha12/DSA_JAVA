/**
 * InnerPrintName
 */
public class InnerPrintName {
    static int count=0;
public static void main(String[] args) {
    printname();
}

public static void printname(){
    if(count==5) return;
    System.out.println("Nilesh");
    count++;
    printname();
}
    
}

