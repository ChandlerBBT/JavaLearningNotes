package CH3_JavaBasic;

//引用和复制元素

import java.util.Arrays;

public class S3_10_3_CopyStruct {
    public static void main(String[] args) {
        copyName();
        copyElements();
    }

    //直接拷贝变量，将会引用数组
    public static void copyName() {
        int[] smallPrimes = {2,3,5,7,11};
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[3] = 8;
        System.out.println(Arrays.toString(smallPrimes));
        System.out.println(Arrays.toString(luckyNumbers));
    }

    //复制数组中的元素
    public static void copyElements() {
        int[] smallPrimes = {2,3,5,7,11};
        //复制元素，并且扩展了数组的长度，注意多余的元素会默认初始化为0
        int[] copiedLuckyNumbers = Arrays.copyOf(smallPrimes, 2 * smallPrimes.length);
        System.out.println(Arrays.toString(smallPrimes));
        System.out.println(Arrays.toString(copiedLuckyNumbers));
    }

}
