package CH4_ObjectAndClass;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Author: Chandler
 * @Description:用户自定义类
 * @Date: 2020/4/19 12:03
 */

//在一个源文件中，只能有一个public类，可以有任意个private类
//关键字public表示任何类的方法都可以调用这些方法
//关键字private表示只有当前类的方法能够访问这些实例域

public class S4_3_1_Employee {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        //构造器与类同名
        //每个类可以有一个以上的构造器
        //构造器没有返回值
        //构造器总是伴随着new操作符一起调用
        //构造器创建的对象存储在Heap空间
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tesla", 40000, 1990, 3, 15);

        //不能对一个已经存在的对象调用构造器来达到重新设置实例域的目的
        //staff[0].Emplyoee("Carl Crachker", 80000, 1987, 12, 12);

        //给每个员工涨薪5%
        for (Employee people: staff) {
            people.raiseSalary(5);
        }

        //打印每个员工的资料
        for (Employee people: staff) {
            System.out.println("name = " + people.getName() + ", salary = " + people.getSalary() + ", hireDay = " +
                    people.getHireDay());
        }
    }
}

class Employee {
    //公有数据非常危险，会被Employee类以外的方法篡改；应该将所有的数据域都设置为私有的数据域
    //注意：Employee类的方法可以访问Employee类的任何一个对象的私有域
    private String name;
    private double salary;
    private LocalDate hireDay;

    //公有的构造器
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    //公有的域访问器
    public String getName() {
        return name;
    }

    //公有的域访问器
    public double getSalary() {
        return salary;
    }

    //公有的域访问器
    public LocalDate getHireDay() {
        return hireDay;
    }

    //公有的域访问器
    //public Date getHireDay() {
        //不要编写返回引用可变对象的访问器方法，例如下面返回hireDay
        //它是Date对象的引用，是可变的
        //return hireDay;

        //如果创建另一个变量，引用hireDay，并且做一些计算，则会改变这个雇员的私有状态，例如：
        //注意这里只是举例，事实上，调用Employee类需要在类的外面
        //Employee harry = new Employee("Harray", 12345, 1990,1,1);
        //Date d = harry.getHireDay();
        //double tenYearsInMilliSeconds = 10 * 365.25 * 24 * 60 * 60 * 1000;
        //d.setTime(d.getTime() - (long) tenYearsInMilliSeconds);

        //如果要创建一个返回引用Date类型的变量，需要在返回之前做clone操作
        //return (Date) hireDay.clone();
    //}

    //公有的域更改器
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;

        //每一个方法中，关键字this表示隐式参数，也即方法调用的目标或接收者
        //double raise = this.salary * byPercent / 100.0;
        //this.salary += raise;
    }
}