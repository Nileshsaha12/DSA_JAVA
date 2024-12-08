import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        //brute(arr1,arr2);
        //optimal1(arr1,arr2);
        optimal2(arr1,arr2);//using gap concept 
    }
    public static void brute(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int[] arr=new int[n+m];
        int right=0;
        int left=0;
        int k=0;
        while(left<n && right<m){
            if(a[left]<=b[right]){
                arr[k++]=a[left++];
            }else{
                arr[k++]=b[right++];
            }
        }
        while(left<n){
            arr[k++]=a[left++];
        }
        while(right<m){
            arr[k++]=b[right++];
        }
        for(int i=0;i<arr.length;i++){
            if(i<n) a[i]=arr[i];
            else b[i-n]=arr[i];
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
    public static void optimal1(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
    public static void optimal2(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n && right>=n){
                    if(arr1[left]>arr2[right-n]){
                        int temp=arr1[left];
                        arr1[left]=arr2[right-n];
                        arr2[right-n]=temp;
                    }
                }else if(left>=n){
                    if(arr2[left-n]>arr2[right-n]){
                        int temp=arr2[left-n];
                        arr2[left-n]=arr2[right-n];
                        arr2[right-n]=temp;
                    }
                }else if(right<n){
                    if(arr1[left]>arr1[right]){
                        int temp=arr1[left];
                        arr1[left]=arr1[right];
                        arr1[right]=temp;
                    }
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }
}
