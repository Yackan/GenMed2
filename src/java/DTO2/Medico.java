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
public class Medico {
    private int idMedico;
    private String nombre;
    
    public Medico() {
        this.idMedico = idMedico;
        this.nombre = nombre;
    }
    public Medico(int idEmpresa, String nombre) {
        this.idMedico = idEmpresa;
        this.nombre = nombre;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idEmpresa) {
        this.idMedico = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
