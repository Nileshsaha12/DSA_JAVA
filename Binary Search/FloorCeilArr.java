public class FloorCeilArr {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int x=25;
        int fl= floor(arr,x);
        int cl=ceil(arr,x);
        System.out.println("Floor " + fl + " Ceil " + cl);
    }
    public static int floor(int[] arr,int x){
        int n=arr.length;
        int num=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                num=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return num;
    }
    public static int ceil(int[] arr,int x){
        int n=arr.length;
        int num=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                num=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return num;
    }
}
