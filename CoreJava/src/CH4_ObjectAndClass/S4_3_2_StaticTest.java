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

        for (EmployeeNew e: staff) {
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
    private static int nextId = 1;

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

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        EmployeeNew e = new EmployeeNew("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}