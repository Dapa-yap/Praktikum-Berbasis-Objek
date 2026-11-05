package Percobaan2;

import P1.Employee;
import P1.PermanentEmployee;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        Employee e = pEmp;

        System.out.println(e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(pEmp.getEmployeeInfo());
    }
}
