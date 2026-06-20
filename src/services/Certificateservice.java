package services;
import DAO.CertificateDAO;
import models.Certificate;
import java.util.Scanner;

public class Certificateservice implements Certificateservices {
    private CertificateDAO certificateDAO=new CertificateDAO();
    @Override
    public void issueCertificate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Certificate Id:");
        String certld = sc.nextLine();
        System.out.print("Student Id:");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Course name:");
        String course = sc.nextLine();
        System.out.print("Issue Date:");
        String date = sc.nextLine();
        Certificate certificate = new Certificate(certld, studentId, course, date, "ACTIVE");
        certificateDAO.addCertificate(certificate);
        System.out.println("Certificate Issued Successfully");
    }
    @Override
    public void verifyCertificate(String certificateld){
        Certificate certificate=certificateDAO.getCertificateById(certificateld);
        if(certificate!=null) {
            System.out.println("\n Certificate Valid");
            System.out.println("Certificate Id:" + certificate.getCertificateId());
            System.out.println("Student Id:" + certificate.getStudentId());
            System.out.println("Course :" + certificate.getCourseName());
            System.out.println("Issue Date:" + certificate.getIssueDate());
            System.out.println("Status:" + certificate.getStatus());
        }
        else {
            System.out.println("Certificate Not Found");
        }
    }
}
