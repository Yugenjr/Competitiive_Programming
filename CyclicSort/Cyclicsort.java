package CyclicSort;
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        
        System.out.println("Sorted array: " + java.util.Arrays.toString(cyclicSort(arr)));
    }

    public static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}