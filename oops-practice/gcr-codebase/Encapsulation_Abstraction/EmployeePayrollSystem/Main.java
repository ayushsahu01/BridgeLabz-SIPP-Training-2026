public class Main {

    public static void main(String[] args) {

        FullTimeEmployee emp1 =
                new FullTimeEmployee(101, "Ayush", 50000);

        PartTimeEmployee emp2 =
                new PartTimeEmployee(102, "Rahul", 80, 250);

        System.out.println("===== Full Time Employee =====");
        emp1.displayEmployeeInfo();
        System.out.println("Salary : ₹" + emp1.calculateSalary());

        System.out.println();

        System.out.println("===== Part Time Employee =====");
        emp2.displayEmployeeInfo();
        System.out.println("Salary : ₹" + emp2.calculateSalary());
    }
}