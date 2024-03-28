public class QuickSort {

    // Method to perform QuickSort
    public static void quickSort(int[] arr, int start, int end) {
        // If the array has 1 or fewer elements, it's already sorted
        if (end <= start) return;

        // Find the pivot element and partition the array
        int pivotIndex = partition(arr, start, end);

        // Recursively sort elements before and after the pivot
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    // Partitioning method to rearrange the elements
    private static int partition(int[] arr, int start, int end) {
        // Choosing the pivot element (in this case, the rightmost element)
        int pivot = arr[end];
        // Index of smaller element
        int i = start - 1;

        // Iterate through the array
        for (int j = start; j < end; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap elements at i and j to move smaller elements to the left of the pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        // Return the partitioning index (position of the pivot element)
        return i + 1;
    }
}
