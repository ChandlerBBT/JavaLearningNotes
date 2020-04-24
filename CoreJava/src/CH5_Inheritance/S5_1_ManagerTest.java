package CH5_Inheritance;

/**
 * @Author: Chandler
 * @Description:展示超类Employee和子类Manager对象在计算薪金上的区别
 * @Date: 2020/4/24 20:08
 */
public class S5_1_ManagerTest {
    public static void main(String[] args) {
        S5_3_Manager boss = new S5_3_Manager("Carl Craker", 80000, 1987, 12, 15);
        //变量staff[0]和boss引用同一个对象，但编译器将staff[0]看成Employee对象，这意味着可以如下调用，但不能staff[0].setBonus()，
        //因为父类不能调用子类中实现的方法
        boss.setBonus(5000);
        //不能将一个超类的引用赋值给子类变量，例如下面的赋值是非法的
        //Manager m = staff[i];
        //因为不是所有的雇员都是经理。如果赋值成功，m可能引用了一个雇员角色的Employee对象，只要一调用m.setBonus()就会引发运行时错误

        S5_2_Employee[] staff = new S5_2_Employee[3];

        staff[0] = boss;
        staff[1] = new S5_2_Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new S5_2_Employee("Tommy Tesla", 40000, 1990, 3, 15);

        for (S5_2_Employee e: staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
