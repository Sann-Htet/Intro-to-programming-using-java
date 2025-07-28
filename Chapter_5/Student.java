package Chapter_5;

public class Student {
    private String name;        // Student's name.
    public double test1, test2, test3;  // Grades on three tests.

    private int ID;     // Unique ID number for this student.
    private static int nextUniqueID = 0;    // keep track of next available unique ID number

    public Student(String theName) {
        // Constructor for Student objects;
        // provides a name for the Student.
        // and assigns the student a unique ID number.
        name = theName;
        nextUniqueID++;
        ID = nextUniqueID;
    }

    public String getName() {
        // Getter method for reading the value of the private
        // instance variable, name.
        return name;
    }

    public int getID() {
        // Getter method for reading the value of ID.
        return ID;
    }

    public double getAverage() {
        // Compute average test grade.
        return (test1 + test2 + test3) / 3;
    }
} // end of class Student