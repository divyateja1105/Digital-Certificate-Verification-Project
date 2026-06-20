package services;

public class Verificationservice {
    private Certificateservice certificateservice=new Certificateservice();
    public void verify(String certificated){
        certificateservice.verifyCertificate(certificated);
    }
}
