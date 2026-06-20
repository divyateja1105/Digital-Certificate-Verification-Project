package models;

public class Organisation {
    private int organisationId;
    private String organisationName;

    public Organisation(int organisationId,String organisationName) {
        this.organisationId=organisationId;
        this.organisationName = organisationName;
    }

    public int getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(int organisationId) {
        this.organisationId = organisationId;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }
}
