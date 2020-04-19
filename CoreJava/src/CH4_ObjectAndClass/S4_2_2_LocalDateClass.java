package CH4_ObjectAndClass;

import java.time.LocalDate;

/**
 * @Author: Chandler
 * @Description:介绍LocalDate类
 * @Date: 2020/4/19 10:49
 */
public class S4_2_2_LocalDateClass {
    public static void main(String[] args) {
        //不要使用构造器来构造LocalDate类的对象，应当使用静态工厂方法代表你调用构造器
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020,4,19));

        //获取属性
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day);

        // 访问器(accessor method)方法只访问对象而不修改对象
        // 更改器(mutator method)方法会就地修改调用者的状态
        LocalDate oneThousandDaysLater = today.plusDays(1000);
        System.out.println(oneThousandDaysLater);
        //很明显，plusDays方法是一个访问器方法
        System.out.println(today);
    }
}
