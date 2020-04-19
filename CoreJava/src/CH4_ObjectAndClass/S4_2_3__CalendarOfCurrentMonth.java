package CH4_ObjectAndClass;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author: Chandler
 * @Description:打印当月的日历
 * @Date: 2020/4/19 11:10
 */
public class S4_2_3__CalendarOfCurrentMonth {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);  // set to the start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();  // Monday = 1, ..., Sunday = 7

        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun\t");
        for (int i = 1; i < value; i++) {
            System.out.print("\t");
        }
        //只要还在本月的范围内，就一直打印
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            //对今天特殊标记
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            //逢周一换行
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
