public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,77};
        int target=55;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    public static int search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, target, low, mid - 1);
        } else {
            return search(arr, target, mid + 1, high);
        }
    }
}
