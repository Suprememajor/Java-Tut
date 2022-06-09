package advance.serializable;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student student = new Student("John", 25, "23 East, California");
        student.setX(5);

        String filename = "test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        //Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n" + student);
        } catch (IOException ex) {
            System.out.println("IOException is ");
        }

        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialized: \n" + object);

            objIn.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
