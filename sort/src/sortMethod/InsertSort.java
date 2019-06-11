package sortMethod;

import java.util.Arrays;

/**
 * 插入排序
 * 第一层一次向后移动，第二层进行对前面部分的排序
 */
public class InsertSort {
    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if (array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.println("插入排序：" + Arrays.toString(array));
    }
}
