//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
public class arraySortedOrNot2pointers {
    public static boolean isSorted(int[] arr){
        int i = 0;
        int j = arr.length-1;
        boolean sorted = true;
        while (i<j) {
            if(arr[i]>arr[j]){
                sorted = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 1, 7, 9, 12, 12, 14};
        System.out.println(isSorted(arr));
    }
}
