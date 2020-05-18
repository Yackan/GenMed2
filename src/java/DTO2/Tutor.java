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
public class Tutor extends Usuario{
    private int idTutor;
    private PacienteL Paciente;
    private int IdPaciente;
    private String apodo;
    private String  alergias;    
    
        
    public Tutor(int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        super(Cedula, nombre, apellido, fechaNacimiento, sangre, condicion);
        this.idTutor = 1;
        this.IdPaciente = Paciente.getIdPaciente();
        this.apodo = "trueno";
        this.alergias = "penicilina";
    }

    public Tutor(int idTutor, int IdPaciente, String apodo, String alergias, int Cedula, String nombre, String apellido, int fechaNacimiento, String sangre, boolean condicion) {
        super(Cedula, nombre, apellido, fechaNacimiento, sangre, condicion);
        this.idTutor = idTutor;
        this.IdPaciente = IdPaciente;
        this.apodo = apodo;
        this.alergias = alergias;
    }

   
    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
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
    
    
    }
