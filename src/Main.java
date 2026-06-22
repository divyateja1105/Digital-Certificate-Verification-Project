import DAO.OrganisationDAO;
import DAO.StudentDAO;
import models.Certificate;
import models.Organisation;
import models.Student;
import services.Certificateservice;
import services.Verificationservice;
import utils.CertificateIdGenerator;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        OrganisationDAO organisationDAO = new OrganisationDAO();
        Certificateservice certificateService = new Certificateservice();
        Verificationservice verificationService = new Verificationservice();

        while (true) {

            System.out.println("\n=== Digital Certificate System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Organisation");
            System.out.println("3. Issue Certificate");
            System.out.println("4. Verify Certificate");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Id: ");
                    int studentsId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Student student = new Student(studentsId, name, email);
                    studentDAO.addStudent(student);

                    break;

                case 2:
                    System.out.print("Enter organisation Id: ");
                    int organisationId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Organisation Name: ");
                    String organisationName = sc.nextLine();

                    Organisation organisation =
                            new Organisation(organisationId, organisationName);

                    organisationDAO.addOrganisation(organisation);

                    break;

                case 3:

                    System.out.print("Enter Student Id: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course Name: ");
                    String course = sc.nextLine();

                    String certId = CertificateIdGenerator.generateCertificateId();

                    String issueDate = LocalDate.now().toString();

                    Certificate certificate =
                            new Certificate(
                                    certId,
                                    studentId,
                                    issueDate,
                                    course,
                                    "ACTIVE"
                            );

                    certificateService.issueCertificate(certificate);

                    System.out.println("Certificate ID: " + certId);

                    break;

                case 4:

                    System.out.print("Enter Certificate ID: ");
                    String id = sc.nextLine();

                    verificationService.verify(id);

                    break;

                case 5:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}