package src.solution;

public class fistOccurrence {
    public int searchFistIndex(int[] array, int x) {
        int firstIndex = -1;
        
        if (array.length > 0) {
            firstIndex = binarySearch(array, 0, array.length - 1, x);
        }

        return firstIndex;
    }

    private int binarySearch(int[] array, int leftIndex, int rightIndex, int x) {
        int res = -1;
        
        if (leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;

            if (array[leftIndex] == x) {
                res = leftIndex;
            }
            else if (array[middle] == x) {
                res = binarySearch(array, leftIndex, middle, x);
            }
            else if (array[middle] > x) {
                res = binarySearch(array, leftIndex, middle - 1, x);
            }
            else if (array[middle] < x) {
                res = binarySearch(array, middle + 1, rightIndex, x);
            }
        }

        return res;
    }
}