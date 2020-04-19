package CH3_JavaBasic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Chandler
 * @Description: 产生一个彩票抽奖过程的随机数组
 * @Date: 2020/4/18 23:32
 */
public class S3_10_5_LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        //    fill the arrays with numbers
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //    draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //    make a random index between 0 and n-1
            int r = (int) (Math.random() * n);

            //    pick the element at the random location
            result[i] = numbers[r];

            //    move the last element into the random location, and drop it
            numbers[r] = numbers[n - 1];
            n--;
        }
        //    print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination.");
        for (int r:result) {
            System.out.print(r + " ");
        }
    }


}
