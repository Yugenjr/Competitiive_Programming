class LinearSearch { 
    public static void main(String[] args) { 
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
        int target = 12; 
        int ans = linearSearch(arr, target, 0); 
        System.out.println(ans); 
    } 
  
    static int linearSearch(int[] arr, int target, int index) { 
        if (index == arr.length) {
        return -1;   // target not found
    }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr, target, index+1);
}
}