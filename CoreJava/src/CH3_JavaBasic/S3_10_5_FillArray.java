package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description: 将数组中的所有元素值设置为x
 * @Date: 2020/4/19 9:23
 */
public class S3_10_5_FillArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 3);
        System.out.println(Arrays.toString(array));
    }
}
