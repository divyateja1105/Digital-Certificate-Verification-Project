package services;

import models.Certificate;

public interface Certificateservices {

    void issueCertificate(Certificate certificate);

    void verifyCertificate(String certificateId);
}