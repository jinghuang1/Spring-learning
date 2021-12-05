package thinkingInJava.array.multiDimArray;

import java.util.Arrays;

/*
Creating multidimensional arrays
 */
public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, },
                {4, 5, 6, }
        };
        //deepToString() can covert n dimensional arrays to string
        System.out.println(Arrays.deepToString(a));
    }
}
