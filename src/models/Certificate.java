package models;

public class Certificate {
    private String certificateId;
    private int StudentId;
    private String CourseName;
    private String issueDate;
    private String status;

    public Certificate(String certificateId, int studentId, String issueDate, String courseName, String status) {
        this.certificateId = certificateId;
        StudentId = studentId;
        this.issueDate = issueDate;
        CourseName = courseName;
        this.status = status;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
