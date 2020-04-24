package CH5_Inheritance;

/**
 * @Author: Chandler
 * @Description:
 * @Date: 2020/4/24 20:15
 */
public class S5_3_Manager extends S5_2_Employee {
    private double bonus;

    public S5_3_Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
