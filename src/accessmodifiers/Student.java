package accessmodifiers;

public class Student {
    public int rollNo = 101;

    public Student() {
        rollNo = 102;
    }

    public void printRollNumber() {
        System.out.println(rollNo);
    }

    public static void main(String args[]) {
        Student s = new Student();
    }
    public void abc() {
        printRollNumber();
    }

}
