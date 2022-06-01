package records;

public class RecordsTutorial {

    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Nobert", 133);
        System.out.println(employee.getName());
        System.out.println(employee);

        EmployeeRecord record = new EmployeeRecord("Nobert", 3233);
        System.out.println(record.name());
        System.out.println(record);
        System.out.println(record.nameInUpperCase());
        EmployeeRecord.printHello();
    }
}
