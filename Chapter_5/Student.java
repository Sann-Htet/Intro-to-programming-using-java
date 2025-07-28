package Chapter_5;

public class Student {
    private String name;        // Student's name.
    public double test1, test2, test3;  // Grades on three tests.

    public Student(String theName) {
        // Constructor for Student objects;
        // provides a name for the Student.
        // The name can't be null.
        if (theName == null) {
            throw new IllegalArgumentException("name can't be null");
        }
        name = theName;
    }

    public String getName() {
        // Getter method for reading the value of the private
        // instance variable, name.
        return name;
    }

    public double getAverage() {
        // Compute average test grade.
        return (test1 + test2 + test3) / 3;
    }
} // end of class Student