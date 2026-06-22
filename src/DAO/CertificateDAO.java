package DAO;

import models.Certificate;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CertificateDAO {

    public void issueCertificate(Certificate certificate) {

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO Certificate VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, certificate.getCertificateId());
            ps.setInt(2, certificate.getStudentId());
            ps.setString(3, certificate.getIssueDate());
            ps.setString(4, certificate.getCourseName());
            ps.setString(5, certificate.getStatus());

            ps.executeUpdate();

            System.out.println("Certificate Issued");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Certificate getCertificateById(String certificateId) {

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT * FROM Certificate WHERE certificate_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, certificateId);

            var rs = ps.executeQuery();

            if (rs.next()) {

                return new Certificate(
                        rs.getString("certificate_id"),
                        rs.getInt("student_id"),
                        rs.getString("issue_date"),
                        rs.getString("course_name"),
                        rs.getString("status")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}