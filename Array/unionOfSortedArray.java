import java.util.*;

public class unionOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 2, 3, 3, 4, 5 };
        // brute(arr1,arr2);
        optimal(arr1, arr2);
    }

    static public void brute(int[] arr1,int[] arr2){
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            st.add(arr2[i]);
        }
        Integer[] union=st.toArray(new Integer[st.size()]);
        for (Integer i: union) {
            System.out.println(i);
        }
    }


    public static void optimal(int[] arr1,int[] arr2){
        List<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0|| union.get(union.size() - 1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size() == 0|| union.get(union.size() - 1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            
            }
        }
    
        while (i<arr1.length) {
            if(union.size() == 0|| union.get(union.size() - 1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        
        }
        while(j<arr2.length){
            if(union.size() == 0|| union.get(union.size() - 1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        
        }
        for (int r : union) {
            System.out.println(r);
        }

    }
    
}
        
