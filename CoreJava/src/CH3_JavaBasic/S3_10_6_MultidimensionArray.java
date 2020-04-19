package CH3_JavaBasic;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description:创建多维数组,并打印元素
 * @Date: 2020/4/19 9:30
 */
public class S3_10_6_MultidimensionArray {
    public static void main(String[] args) {
        //使用自定义的方法打印二维数组的元素
        buildDynamicMultiDArray();
        System.out.println();
        buildStaticMultiDArray();

        int[][] twoDArray = new int[4][3];
        //fill方法只能处理一维数组
        //Arrays.fill(twoDArray, 3);
        System.out.println(Arrays.deepToString(twoDArray));

    }

    public static void buildDynamicMultiDArray() {
        int[][] multiDArrays = new int[4][7];
        printMultiDArray(multiDArrays);
    }

    public static void buildStaticMultiDArray() {
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };
        printMultiDArray(magicSquare);
    }

    public static void printMultiDArray(@NotNull int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length - 1) {
                    System.out.print(array[i][j] + ",");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}