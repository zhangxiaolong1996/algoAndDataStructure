package sortMethod;

import java.util.Arrays;

/**
 * 快速排序
 */
public class FastSort {
    public static void sort(int[] array, int low, int high){
        if (low > high){
            return;
        }
        int i = low, j = high;
        int standard = array[low];
        while (i < j){
            while (array[j] >= standard && i < j ){
                j--;
            }

            while (array[i] <= standard && i < j){
                i++;
            }

            if (i<j) {
                int t = array[j];
                array[j] = array[i];
                array[i] = t;
            }
        }
        array[low] = array[i];
        array[i] = standard;

        sort(array, low, j-1);
        sort(array, j+1, high);
    }
}
