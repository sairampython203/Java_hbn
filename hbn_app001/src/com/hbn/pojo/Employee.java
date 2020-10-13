package com.hbn.pojo;

public class Employee {
    private int empEno;
    private String empName;
    private float empSal;
//    private com.hbn.pojo.EmployeeDts empDts;

    public Employee(int empEno, String empName, float empSal) {
        this.empEno = empEno;
        this.empName = empName;
        this.empSal = empSal;
//        this.empDts = empDts;
    }

    public Employee() {
        super();
    }


    public int getEmpEno() {
        return empEno;
    }

    public void setEmpEno(int empEno) {
        this.empEno = empEno;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSal() {
        return empSal;
    }

    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

//    public com.hbn.pojo.EmployeeDts getEmpDts() {
//        return empDts;
//    }
//
//    public void setEmpDts(com.hbn.pojo.EmployeeDts empDts) {
//        this.empDts = empDts;
//    }

    @Override
    public String toString() {
        return "com.hbn.pojo.Employee{" +
                "empEno=" + empEno +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
//                ", empDts=" + empDts +
                '}';
    }
}
