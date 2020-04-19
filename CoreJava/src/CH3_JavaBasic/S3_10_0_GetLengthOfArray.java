package CH3_JavaBasic;

//获取数组的长度

public class S3_10_0_GetLengthOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        getLengthOfArray(arr);
    }

    //    将数组作为参数传入，计算它的长度
    public static void getLengthOfArray(int[] array) {
        int length = array.length;
        System.out.println("the incoming array's length contains " + length + " elements.");
    }
}
