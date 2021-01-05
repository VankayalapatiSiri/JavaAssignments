class Emp {
    int empId;
    String empName;
    String designation;
    double basic;
    double hra;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasic() throws LowSalException {
        if (basic < 500) {
            throw new LowSalException("Salary is low Exception.");
        } else {
            return basic;
        }
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    Emp(int empId, String empName, String designation, double basic) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;

    }

    void printDET() {
        System.out.println("Employee Id is :" + empId);
        System.out.println("Employee Name is :"+empName);
        System.out.println("Destination is :" + designation);
        System.out.println("Basic is :" + basic);

    }

    void calculateHRA() {
        if (designation == "Manager") {

            hra = basic * 0.1;
            System.out.println("HRA OF MANAGER : " + hra);
        } else if (designation == "Officer") {

            hra = basic * 0.12;
            System.out.println("HRA OF OFFICER : " + hra);
        } else {

            hra = basic * 0.05;
            System.out.println("HRA OF CLEARK : " + hra);
        }

    }


}

public class Question7 {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "Siri", "Manager", 50000);
        e1.printDET();
        e1.calculateHRA();
        System.out.println();
    }

}
