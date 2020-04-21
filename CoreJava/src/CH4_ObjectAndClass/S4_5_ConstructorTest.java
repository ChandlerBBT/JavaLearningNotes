package CH4_ObjectAndClass;

/**
 * @Author: Chandler
 * @Description:构造器初始化的诸多特性
 * @Date: 2020/4/21 21:39
 */

import java.util.Random;

public class S4_5_ConstructorTest {
    public static void main(String[] args) {
        EmployeeConstructor[] staff = new EmployeeConstructor[3];

        staff[0] = new EmployeeConstructor("Harry", 40000);
        staff[1] = new EmployeeConstructor(60000);
        staff[2] = new EmployeeConstructor();

        for (EmployeeConstructor e: staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class EmployeeConstructor {
    private static int nextId;

    private int id;
    //实例域初始化
    private String name = "";
    private double salary;

    //static初始化块
    static {
        Random generator = new Random();
        //设置nextId为一个0到9999之间的随机数
        nextId = generator.nextInt(10000);
    }

    //对象实例化块
    {
        id = nextId;
        nextId++;
    }

    //重载构造器
    public EmployeeConstructor(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
    }

    //重载构造器
    public EmployeeConstructor(double aSalary) {
        //调用EmployeeConstructor(String, double)，即上面那个构造器
        //这里的目的是为了重载构造器，使用this语法可以免去再编写一次构造器的繁琐
        //TODO 思考：为什么这里不调用下面这个无参数构造器呢？
        this("EmployeeConstructor #" + nextId, aSalary);
    }

    //重载构造器
    //无参数的默认构造器
    public EmployeeConstructor() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}