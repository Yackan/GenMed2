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
     String Username="idjlcmanrtjfvc";
     String password="88406d594515bfa8e27c18e7a15a6f45531f5bfa147cf898b1ffcf8ccbf2dec9";
     String Host="ec2-52-201-55-4.compute-1.amazonaws.com";
     String Port="5432";
     String Database="d33vt2attounmi";
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
