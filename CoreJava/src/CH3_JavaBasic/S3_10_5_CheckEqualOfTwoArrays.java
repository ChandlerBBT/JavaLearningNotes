package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description:检查两个数组是否长度一样，且相同索引上的值都相等
 * @Date: 2020/4/19 9:26
 */
public class S3_10_5_CheckEqualOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {2,3,4,5,6};
        int[] arrayC = {1,2,3,4,5};
        System.out.println("The arrayA = arrayB? " + Arrays.equals(arrayA, arrayB));
        System.out.println("The arrayA = arrayC? " + Arrays.equals(arrayC, arrayA));
    }
}
