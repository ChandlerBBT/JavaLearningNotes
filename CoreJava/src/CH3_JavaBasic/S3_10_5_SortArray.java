package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description: 对数组排序；使用Arrays.sort()方法，快排算法
 * @Date: 2020/4/18 23:25
 */
public class S3_10_5_SortArray {
    public static void main(String[] args) {
        int[] randomArray = {1, 4, 2, 5, 6, 9, 8, 3};
        // 这个方法没有返回值, 就地排序
        Arrays.sort(randomArray);
        for (int r:randomArray) {
            System.out.print(r);
        }
    }
}
