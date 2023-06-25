// rename branch ctrl+shift+P
public class first {
	public static boolean isSorted(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
        	if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        
        return true;
    }
	public static void main(String[] args) {
		// check whether array is sorted
		
		 int[] array1 = {1, 2, 3, 4, 5};
	        System.out.println("Array1 is sorted: " + isSorted(array1));
	        
	        int[] array2 = {5, 2, 9, 1, 3};
	        System.out.println("Array2 is sorted: " + isSorted(array2));
	}

}
