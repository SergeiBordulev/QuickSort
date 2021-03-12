import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        int x = array[left];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < x) {
                ++i;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (j > left) {
            quickSort(array, left, j);
        }

        if (i < right) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        // int[] array = {17, 16, 5, 14, 13, 12, 11, 15, 4, 3};
        int[] array = {7, 5, 6, 4, 9, 8, 2, 1, 3, 17, 16, 14, 13, 12, 11, 15, 19, 23, 65, 48};

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println();
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(array));
    }
}
