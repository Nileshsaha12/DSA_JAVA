import java.util.ArrayList;
import java.util.*;

public class rearange2 {
    public static void main(String[] args) {
        int[] arr={1,2,-1,-3,-4,-2,1,4,7,9,7};
        optimal(arr);
    }
    public static void optimal(int[] arr){
        int n=arr.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr[i*2]=pos.get(i);
                arr[i*2+1] =neg.get(i);
            }
            int idx=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr[idx]=pos.get(i);
                idx++;
            }
        }else{
            for(int i=0;i<pos.size();i++){
                arr[i*2]=pos.get(i);
                arr[i*2+1] =neg.get(i);
            }
            int idx=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                arr[idx]=neg.get(i);
                idx++;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
