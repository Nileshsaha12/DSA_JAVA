import java.util.*;
public class moveZero {
    public static void main(String[] args) {
        int[] arr={3,4,0,5,0,3,3,0,0,2,0,2};
        optimal(arr);
        //brute(arr);
    }
    static public void brute(int[] arr){
        int n=arr.length;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i=temp.size();i<n;i++){
            arr[i]=0;
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
    static public void optimal(int[] arr){
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i] !=0){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                j++;
            }

        }
        for (int num : arr) {
            System.out.println(num);
        }
    }

}
