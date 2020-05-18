/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO2;

/**
 *
 * @author Sulay2016
 */
public class Administrador extends Usuario{
    int IdAdministrador;
    String contrasenia;
    int idUsuario;

    public Administrador(int IdAdministrador, String contrasenia, int idUsuario, int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        super(Cedula, nombre, apellido, fechaNacimiento, sangre, condicion);
        this.IdAdministrador = IdAdministrador;
        this.contrasenia = contrasenia;
        this.idUsuario = idUsuario;
    }

    public Administrador(int IdAdministrador, String contrasenia, int idUsuario) {
        this.IdAdministrador = IdAdministrador;
        this.contrasenia = contrasenia;
        this.idUsuario = idUsuario;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int IdAdministrador) {
        this.IdAdministrador = IdAdministrador;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
