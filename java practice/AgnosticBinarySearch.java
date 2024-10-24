public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,31,39};
        int target = 7;
        if (arr[0]>arr[arr.length - 1]) {
            int index = bs1(arr,target);
            System.out.println(index);
        }else{
            int index = bs(arr,target);
            System.out.println(index);
        }
        
    }
    static int bs(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;
        while (start<=end) {
            int mid = start + (end - start) / 2 ;
            if (target==arr[mid]) {
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
        }
        return end;

    }
    static int bs1(int[] arr , int target1){
        int start = 0;
        int end = arr.length -1 ;
        while (start<=end) {
            int mid = start + (end - start) / 2 ;
            if (target1==arr[mid]) {
                return mid;
            }
            if(target1>arr[mid]){
                end=mid-1;
            }
            if(target1<arr[mid]){
                start=mid+1;
            }
        }
        return -1;

    }
    
}
