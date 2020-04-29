package com.iut.as.dao;
import java.sql.*;

public class Requete {


    public static ResultSet uneRequete(String Req) {


        ResultSet resultat = null;

        try {
            Connection laConnection = ConnectionBDD.getInstance();
            Statement requete =  laConnection.createStatement();
            resultat = requete.executeQuery(Req);

        }

        catch (SQLException sqle) {
            System.out.println("Pb select" + sqle.getMessage());
        }


        return resultat;

    }

}