import sortMethod.BubbleSort;
import sortMethod.FastSort;
import sortMethod.InsertSort;
import sortMethod.SelectSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrary = {3, 6, 1, 9, 10, 2, 8};
//        BubbleSort.sort(arrary);
//        SelectSort.sort(arrary);
//        InsertSort.sort(arrary);
        FastSort.sort(arrary, 0, arrary.length-1);
        System.out.println(Arrays.toString(arrary));
    }
}
