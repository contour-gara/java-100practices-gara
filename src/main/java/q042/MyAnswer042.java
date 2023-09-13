package q042;

import java.util.HashSet;
import java.util.Set;

/**
 * 42の解答。
 */
public class MyAnswer042 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Student student1 = new Student("rajeev", 24);
        Student student2 = new Student("rajeev", 24);

        System.out.println(student1.equals(student2));

        Set<Student> students = new HashSet<>();
        students.add(student1);
        System.out.println(students.contains(student2));
        System.out.println("employee.hashCode():  " + student1.hashCode()
                + "  employee1.hashCode():" + student2.hashCode());
    }
}
