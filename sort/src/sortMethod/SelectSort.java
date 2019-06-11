package sortMethod;

import java.util.Arrays;

/**
 * 选择排序
 * 选择每一次循环的最小值，然后放到当前第一层循环的位置
 */
public class SelectSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }

        System.out.println("选择排序：" + Arrays.toString(array));
    }
}
