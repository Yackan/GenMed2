package DTO2;

/*
 * Copyright 2018 Sulay2016.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 * @author Sulay2016
 */
public class Usuario {
    private int Cedula;
    private String nombre;
    private String apellido;
    private int fechaNacimiento;
    private String sangre;
    private boolean condicion;
    
    public Usuario() {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sangre = sangre;
        this.condicion = condicion;
    }

    public Usuario(int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sangre = sangre;
        this.condicion = condicion;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }


    public Usuario setCondicion(Usuario cl) {
        boolean d=cl.condicion;
       
       if(d==true){
          PacienteL r= cl.incribirPacienteL(cl);
       }
        if(d==false){
         Paciente r= cl.incribirPaciente(cl);
       }
        Usuario g=cl; return g;
    }
    
    public PacienteL incribirPacienteL(Usuario cl) {
    PacienteL cliente= new  PacienteL(cl.getCedula(), cl.getNombre(), cl.getApellido(), cl.getFechaNacimiento(), cl.getSangre(), cl.condicion);
    return cliente;
    }
    public Paciente incribirPaciente(Usuario cl) {    
    Paciente cliente= new  Paciente(cl.getCedula(), cl.getNombre(), cl.getApellido(), cl.getFechaNacimiento(), cl.getSangre(), cl.condicion);
    return cliente;
    }
}
 