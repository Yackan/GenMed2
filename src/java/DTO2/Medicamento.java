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
public class Medicamento {
     private int idMedicamento;
    private String nombre;
    private String  posologia;    
    private int dosis;
    private String  viaAdministrativa;   

      public Medicamento() {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.posologia = posologia;
        this.dosis = dosis;
        this.viaAdministrativa = viaAdministrativa;
    }
    
    public Medicamento(int idMedicamento, String nombre, String posologia, int dosis, String viaAdministrativa) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.posologia = posologia;
        this.dosis = dosis;
        this.viaAdministrativa = viaAdministrativa;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getViaAdministrativa() {
        return viaAdministrativa;
    }

    public void setViaAdministrativa(String viaAdministrativa) {
        this.viaAdministrativa = viaAdministrativa;
    }
    


    
}