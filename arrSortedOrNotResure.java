public class arrSortedOrNotResure {
    public static void main(String[] args) {
        int[] arr = {10,20,3,40,50};
        int i =0;
        int n = arr.length;
        System.out.println(isSortedOrNot(arr,i,n));
    }
    public static boolean isSortedOrNot(int[] arr, int i, int n){
        if(i==n || i==n-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSortedOrNot(arr,i+1,n);
    }
}
