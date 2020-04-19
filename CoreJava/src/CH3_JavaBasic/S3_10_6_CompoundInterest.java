package CH3_JavaBasic;

import java.util.Arrays;

/**
 * @Author: Chandler
 * @Description:复利计算表
 * @Date: 2020/4/19 9:49
 */
public class S3_10_6_CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //将利率设置为10%,11%,...,15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        //设置初始本金为1万
        //for (int j = 0; j < balances[0].length; j++) {
        //    balances[0][j] = 10000;
        //}
        Arrays.fill(balances[0], 10000);

        //计算未来年份的余额
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                //获取上一年的余额
                double oldBalance = balances[i-1][j];

                //计息
                double interest = oldBalance * interestRate[j];

                //计算今年的余额
                balances[i][j] = oldBalance + interest;
            }
        }

        //打印一行利率数值作为表头
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        //打印余额表
        for (double[] row: balances) {
            for (double b: row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}
