package CH3_JavaBasic;

//创建数组并初始化的几种方法

public class S3_10_0_CreateStruct {
    public static void main(String[] args) {
        buildStruct();
    }

    //    创建一个长度为10的数组，并且依次给每个索引上的元素赋值为索引值
    public static void buildStruct() {
        //动态创建数组
        int[] dynamicArray = new int[10];
        //静态创建数组
        int[] staticArray = {1, 2, 3, 4, 5};
        //匿名数组
        dynamicArray = new int[]{1, 2, 3, 4, 5};

    }
}
