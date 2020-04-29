package com.iut.as.dao;
import  java.sql.*;


public class ConnectionBDD {

    //URL de connexion
    private String url = "jdbc:mysql://localhost:3306/banque";
    //Nom du user
    private String login = "root";
    //Mot de passe de l'utilisateur
    private String pwd = "mdptest";
    //Objet Connection
    private static Connection connect;

    // Constructeur privé
    private ConnectionBDD() {

        try {
            connect = DriverManager.getConnection(url,login,pwd);
        } catch (SQLException sqle) {
            System.out.println("Erreur connexion"+sqle.getMessage());
        }

    }

    //instance de Connection
    public static Connection getInstance(){
        if(connect == null){
            new ConnectionBDD();
            System.out.println("INSTANCIATION DE LA CONNEXION SQL ! ");
        }
        return connect;
    }

}





