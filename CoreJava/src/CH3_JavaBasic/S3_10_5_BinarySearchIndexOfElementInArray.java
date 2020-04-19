package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description: 在数组中使用二分搜算算法查询指定元素的索引
 * @Date: 2020/4/19 9:19
 */
public class S3_10_5_BinarySearchIndexOfElementInArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        int indexOfIt;
        indexOfIt = Arrays.binarySearch(array, 33);
        System.out.println("The index of 33 is " + indexOfIt);
    }
}
