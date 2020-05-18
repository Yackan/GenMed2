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
 **@author Sulay Cupitra
 */
public class Consultas extends Conexion{
    public boolean autenticacion(String Usuario,String Contraseña){
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String consulta="SELECT * FROM  proyecto10.persona WHERE Usuario= ?  AND  Contrasena=?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,Usuario);
            pst.setString(2,Contraseña);
            rs=pst.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(SQLException e){
            System.out.println("Error"+e);
        }finally{
            try{
                if(getConexion()!=null)getConexion().close();
                if(pst !=null)pst.close();
                if(rs!=null) rs.close();
            }catch(Exception e){
              //System.out.println("Error"+e);
            }
        }
        return false;
    }
  
}
