package records;

import java.io.Serializable;

//Records cannot extend any other class
//Records are also final in nature, that is they cannot be extended
//They are allowed to implement interfaces
//You can override canonical constructor
public record EmployeeRecord(String name, int employeeNumber) /*implements Serializable*/ {

    //Override constructor
    /*public EmployeeRecord(String name, int employeeNumber) {
        if (employeeNumber < 0)
            throw new IllegalArgumentException("employeeNumber cannot be negative");
        this.name = name;
        this.employeeNumber = employeeNumber;
    }*/

    //Override constructor
    //Compact constructor
    public EmployeeRecord {
        if (employeeNumber < 0)
            throw new IllegalArgumentException("employeeNumber cannot be negative");
    }

    //static fields can be added
    public static final String DEFAUlT_EMPLOYEE_NAME = "Sam";

    //instance fields not allowed in here
    //private String field;

    //instance methods can be added
    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    //static methods can be added
    public static void printHello() {
        System.out.println("Hello!!!");
    }
}
