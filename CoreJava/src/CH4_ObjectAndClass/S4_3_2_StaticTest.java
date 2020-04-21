package CH4_ObjectAndClass;

/**
 * @Author: Chandler
 * @Description:静态域、final域
 * @Date: 2020/4/20 21:09
 */
public class S4_3_2_StaticTest {
    public static void main(String[] args) {
        EmployeeNew[] staff = new EmployeeNew[3];

        staff[0] = new EmployeeNew("Tom", 40000);
        staff[1] = new EmployeeNew("Dick", 60000);
        staff[2] = new EmployeeNew("Harry", 65000);

        for (EmployeeNew e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary() +
                    " The nextId will be " + EmployeeNew.getNextId());
        }

        int n = EmployeeNew.getNextId();
        System.out.println("Next available id=" + n);
    }
}

//注意，这里不能命名为Employee，会和S4_3_1Employee.class冲突
class EmployeeNew {
    //静态私有域
    private static int nextId = 1;

    //私有域
    private String name;
    private double salary;
    private int id;

    public EmployeeNew(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        id = nextId;
        nextId++;
    }

    //静态方法没有this参数，不能操作对象，故此不能访问Id实例域。但静态方法可以访问自身类中的静态域
    //可以使用对象调用静态方法，因此static关键字理论上可去掉。但是这么一来，最好使用Employee.getNextId()来访问，
    //而非使用harry.getNextId()，因为nextId和harry这个对象没有任何关系，容易使人困惑。
    //一个方法不需要访问对象装填，其所需参数都通过显式参数提供时使用静态方法（e.g.,Math.pow）
    //一个方法只需要访问类的静态域（e.g.,Employee.getNextId）
    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        EmployeeNew e = new EmployeeNew("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}