package models;

public class Student extends Person {
    private int studentId;
    public Student(int studentsId,String name,String email){
        super(name,email);
        this.studentId=studentsId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
