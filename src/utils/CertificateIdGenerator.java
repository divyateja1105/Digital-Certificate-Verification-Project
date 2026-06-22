package utils;

public class CertificateIdGenerator {

    private static int count = 1001;

    public static String generateCertificateId() {
        return "CERT" + count++;
    }
}