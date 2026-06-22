package services;

import DAO.CertificateDAO;
import models.Certificate;

public class Certificateservice implements Certificateservices {

    private CertificateDAO certificateDAO = new CertificateDAO();

    @Override
    public void issueCertificate(Certificate certificate) {

        certificateDAO.issueCertificate(certificate);

        System.out.println("Certificate Issued Successfully");
    }

    @Override
    public void verifyCertificate(String certificateId) {

        Certificate certificate =
                certificateDAO.getCertificateById(certificateId);

        if (certificate != null) {

            System.out.println("\nCertificate Valid");
            System.out.println("Certificate Id : " + certificate.getCertificateId());
            System.out.println("Student Id : " + certificate.getStudentId());
            System.out.println("Course : " + certificate.getCourseName());
            System.out.println("Issue Date : " + certificate.getIssueDate());
            System.out.println("Status : " + certificate.getStatus());

        } else {

            System.out.println("Certificate Not Found");
        }
    }
}