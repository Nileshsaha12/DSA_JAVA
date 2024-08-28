public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,5,3,5,2,432,2,4};
        int n=arr.length-1;
        Mergesort(arr,0,n);
        for(int nr:arr) System.out.println(nr);
    }
    public static void Mergesort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        Mergesort(arr, l, mid);
        Mergesort(arr, mid+1, r);
        Merge(arr,l,mid,r);

    }
    public static void Merge(int[] arr,int left,int mid,int right){
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;
    
        // Create temporary arrays
        int[] lArr=new int[n1];
        int[] rArr=new int[n2];
    
        // Copy data to temporary arrays
        for (i = 0; i < n1; i++)
            lArr[i] = arr[left + i];
        for (j = 0; j < n2; j++)
            rArr[j] = arr[mid + 1 + j];
    
        // Merge the temporary arrays back into arr[left..right]
        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
    
        // Copy the remaining elements of lArr[], if any
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
    
        // Copy the remaining elements of rArr[], if any
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
