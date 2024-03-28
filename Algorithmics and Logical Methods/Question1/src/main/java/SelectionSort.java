public class SelectionSort {

    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        // Loop through the array elements
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            // Assume the current index has the minimum value
            int minIndex = currentIndex;

            // Find the index of the minimum value in the remaining unsorted part of the array
            for (int innerIndex = currentIndex + 1; innerIndex < array.length; innerIndex++) {
                // Check if the current element is smaller than the assumed minimum
                if (array[minIndex] > array[innerIndex]) {
                    // Update the minimum index if a smaller element is found
                    minIndex = innerIndex;
                }
            }

            // Swap the current element with the minimum element found
            swap(array, currentIndex, minIndex);
        }
    }

    // Method to swap elements in the array
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        // Temporary variable to hold the value during swapping
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
