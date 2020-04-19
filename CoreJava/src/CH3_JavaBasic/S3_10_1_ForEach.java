package CH3_JavaBasic;

public class S3_10_1_ForEach {
    public static void main(String[] args) {
        int[] array = new int[7];
        int[] newArray = filledArray(array);
        printEachElements(newArray);
    }

    public static void printEachElements(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static int[] filledArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
