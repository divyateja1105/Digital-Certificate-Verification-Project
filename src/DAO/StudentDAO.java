package DAO;

import models.Student;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(Student student) {

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO Student(studentsId,name,email) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);
            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());

            ps.executeUpdate();

            System.out.println("Student Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}