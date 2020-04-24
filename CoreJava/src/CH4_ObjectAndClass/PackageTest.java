package CH4_ObjectAndClass;

/**
 * @Author: Chandler
 * @Description:导入包的例子
 * @Date: 2020/4/24 19:13
 */

import CH4_ObjectAndClass.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        System.out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
