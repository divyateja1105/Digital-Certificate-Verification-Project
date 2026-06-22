package DAO;

import models.Organisation;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrganisationDAO {

    public void addOrganisation(Organisation organisation) {

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO Organisation(organisationId,organisationName) VALUES(?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);
            ps.setInt(1,
                    organisation.getOrganisationId());
            ps.setString(2,
                    organisation.getOrganisationName());

            ps.executeUpdate();

            System.out.println("Organisation Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}