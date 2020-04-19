package CH4_ObjectAndClass;

import java.util.Date;

/**
 * @Author: Chandler
 * @Description:构造器的使用方法
 * @Date: 2020/4/19 10:38
 */
public class S4_2_1_Constructor {
    public static void main(String[] args) {
        //构造器是一种特殊的方法，用来构造并初始化对象
        //例如，Date类的构造器名字是Date，想要构造一个Date对象，就在构造器前面加上new操作符
        System.out.println(new Date());

        //Date类中有一个toString方法，返回日期的字符串描述
        System.out.println(new Date().toString());

        Date deadline;
        //注意，deadline不是一个对象，也没有引用对象，不能讲任何Date方法用于这个变量，会引发编译错误
        //deadline.toString();
        //强调一下，对象变量并不包含对象，仅仅引用一个对象
        deadline = new Date();
    }
}
