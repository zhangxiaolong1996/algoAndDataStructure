package sortMethod;

import java.util.Arrays;

/**
 * 冒泡排序
 * 通过n次循环
 */
public class BubbleSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array.length-i-1; j++){
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        System.out.println("冒泡排序：" + Arrays.toString(array));
    }

}
