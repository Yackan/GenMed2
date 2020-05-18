/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
*@author Sulay Cupitra
* 
 */
public class Conexion {
    /* 
    String Username="root";
     String password="1234";
     String Host="localhost";
     String Port="3306";
     String Database="proyecto10";
     String CLASSNAME="com.mysql.jdbc.Driver";
     String URL="jdbc:mysql://"+Host+":"+Port+"/"+Database;
     */
     String Username="ddwtnferbshytw";
     String password="9ef94031d94dc100b155809e41cc63ba5a889156e198aa35397efa544fb7c89b";
     String Host="ec2-54-243-137-182.compute-1.amazonaws.com";
     String Port="5432";
     String Database="d93r01o1jec57m";
     String CLASSNAME="org.postgresql.Driver";
     String URL="jdbc:postgresql://"+Host+":"+Port+"/"+Database + "?sslmode=require";
     
     
     Connection coon;
  
    public Conexion(){
        try{
           Class.forName(CLASSNAME);
           coon=DriverManager.getConnection(URL,Username , password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error"+e);
        }
    }
    public Connection getConexion(){
        return coon;
    }

    
}
