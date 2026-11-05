package Percobaan3;

import P1.ElectricityBill;
import P1.Employee;
import P1.InternshipEmployee;
import P1.Payable;
import P1.PermanentEmployee;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);

        ElectricityBill eBill = new ElectricityBill(5, "R-1");

        Employee[] e = { pEmp, iEmp };
        Payable[] p = { pEmp, eBill };
        //Employee[] e2 = { pEmp, iEmp, eBill }; 

        // Baris ini menyebabkan error karena eBill bukan turunan dari Employee
        // Baris berikut menyebabkan error jika diaktifkan:
        // Employee[] eBillArray = {pEmp, eBill};
    }
}
