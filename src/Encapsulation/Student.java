package Encapsulation;

public class Student {
    private int rollNumber;
    private String name;
    private boolean isAttended;
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setStudentAttendance(boolean flag) {
        if(!isAttended)
            isAttended = flag;
        System.out.print("teacher assigned attendance to the student");
    }
    public boolean getStudentAttendance() {
        System.out.println("teacher accessed student attendance");
        return isAttended;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean isAttended() {
        return isAttended;
    }

    public void setAttended(boolean attended) {
        isAttended = attended;
    }
}
