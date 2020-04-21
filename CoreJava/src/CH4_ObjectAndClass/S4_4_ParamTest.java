package CH4_ObjectAndClass;

/**
 * @Author: Chandler
 * @Description:失败的引用调用
 * @Date: 2020/4/21 20:50
 */
public class S4_4_ParamTest {
    public static void main(String[] args) {
        /*
        * 方法不能修改基本数据类型的参数（数值型或布尔型）
        * */
        System.out.println("测试三倍化数值");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        //基本数据类型作为参数
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
        * 方法可以改变对象参数的状态
        * */
        System.out.println("\n测试三倍化数值");
        EmployeeParamTest harry = new EmployeeParamTest("Harray", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        //对象作为参数
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
        * 方法不能让对象参数再引用新的对象
        * */
        System.out.println("\n测试互换");
        EmployeeParamTest a = new EmployeeParamTest("Alice", 70000);
        EmployeeParamTest b = new EmployeeParamTest("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    //不能达到预期效果
    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("调用方法后: x=" + x);
    }

    public static void tripleSalary(EmployeeParamTest x) {
        x.raiseSalary(200);
        System.out.println("调用方法后：salary=" + x.getSalary());
    }

    public static void swap(EmployeeParamTest x, EmployeeParamTest y) {
        EmployeeParamTest temp = x;
        x = y;
        y = temp;
        System.out.println("调用方法后：x=" + x.getName());
        System.out.println("调动方法后：y=" + y.getName());
    }
}

class EmployeeParamTest {
    private String name;
    private double salary;

    public EmployeeParamTest(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
