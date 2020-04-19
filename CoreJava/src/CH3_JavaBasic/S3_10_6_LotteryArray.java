package CH3_JavaBasic;

/**
 * @Author: Chandler
 * @Description:不规则数组，每一行的长度不同
 * @Date: 2020/4/19 10:15
 */
public class S3_10_6_LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        //创建一个二维数组，并且每一行都比前一行多一个元素
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }

        //构造杨辉三角，这里的算法有点难懂，先跳过
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }

        for (int[] row: odds) {
            for (int odd: row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
