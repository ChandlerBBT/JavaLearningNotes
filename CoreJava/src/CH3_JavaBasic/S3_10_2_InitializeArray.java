package CH3_JavaBasic;

import java.util.Arrays;

public class S3_10_2_InitializeArray {
    public static void main(String[] args) {
        // 静态初始化数组
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        System.out.println("small Primes: " + Arrays.toString(smallPrimes));

        //        匿名初始化数组
        System.out.println("bigger Primes: " + Arrays.toString(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41}));
    }
}
