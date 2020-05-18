/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sulay Cupitra
 */
public class CrearUsuarios extends Conexion {

    public String CrarUsuario(int CodEST, String Nombre, String Apellido, String Semestre, String Carrera, String Usuario, String Contraseña) {
        PreparedStatement pstpersona = null;
        PreparedStatement pstusuario = null;
        try {
            String insert1 = "insert into persona (CodEST,CodAD, Nombre,Apellido,Usuario,Contrasena) values (?,?,?,?,?,?)";
            pstpersona = getConexion().prepareStatement(insert1);
            pstpersona.setInt(1, CodEST);
            pstpersona.setInt(2, 0);
            pstpersona.setString(3, Nombre);
            pstpersona.setString(4, Apellido);
            pstpersona.setString(5, Usuario);
            pstpersona.setString(6, Contraseña);

            String insert2 = "insert into Usuarios (CodEST,Semestre,Carrera) values (?,?,?)";
            pstusuario = getConexion().prepareStatement(insert2);
            pstusuario.setInt(1, CodEST);
            pstusuario.setString(2, Semestre);
            pstusuario.setString(3, Carrera);

            
            pstusuario.execute();
            pstpersona.execute();
            
        } 
        catch (Exception e) 
        {
            String a = "";
        }
        return "";
    }
}
