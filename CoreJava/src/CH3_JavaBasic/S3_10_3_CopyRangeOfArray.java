package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description: 复制数组的指定范围的下表，赋给新的变量
 * @Date: 2020/4/19 9:12
 */
public class S3_10_3_CopyRangeOfArray {
    public static void main(String[] args) {
        int[] originArray = {1,2,3,4,5,6,7,8,9};
        int[] copiedArray = Arrays.copyOfRange(originArray, 3, 5);
        System.out.println(Arrays.toString(copiedArray));
    }
}
