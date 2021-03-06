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
package DTO2;

/**
 *
 * @author Sulay2016
 */
public class PacienteL extends  Usuario{
    private int idPacienteL;
    private String apodo;
    private String  alergias;    
    
    public PacienteL(int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        super(Cedula, nombre, apellido, fechaNacimiento, sangre, condicion);
        this.idPacienteL = 1;
        this.apodo = "trueno";
        this.alergias = "AINES";
    }

    public PacienteL(int idPaciente, String apodo, String alergias, int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        super(Cedula, nombre, apellido, fechaNacimiento, sangre, condicion);
        this.idPacienteL = idPaciente;
        this.apodo = apodo;
        this.alergias = alergias;
    }

    public int getIdPaciente() {
        return idPacienteL;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPacienteL = idPaciente;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

   public Tutor crearTutor() {
     PacienteL pacienteL2=new PacienteL(idPacienteL, apodo, apodo, idPacienteL, apodo, true);
     Tutor lazarillo= new Tutor(idPacienteL, apodo, apodo, idPacienteL, apodo, true);
     return lazarillo;
    }
    

}