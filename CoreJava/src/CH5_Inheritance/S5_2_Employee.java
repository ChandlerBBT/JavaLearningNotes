package CH5_Inheritance;

import java.time.LocalDate;

/**
 * @Author: Chandler
 * @Description:超类
 * @Date: 2020/4/24 20:10
 */
public class S5_2_Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public S5_2_Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHreDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
