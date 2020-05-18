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
public class Doctor {
    Medico medico = new Medico();
    Especialidad profesionalMedicina= new Especialidad();
    int IdDoctor;
    String descripcion;
    int idMedicotratante;
    int Profesiondelmedico;

    public Doctor(int IdDoctor, String descripcion, int idMedicotratante, int Profesiondelmedico,Medico medico,Especialidad profesionalMedicina) {
        this.IdDoctor = IdDoctor;
        this.descripcion = descripcion;
        this.idMedicotratante = medico.getIdMedico();
        this.Profesiondelmedico = profesionalMedicina.getIdEspecialidad();
    }
    
      public Doctor(Medico medico,Especialidad profesionalMedicina) {
        this.IdDoctor = 1;
        this.descripcion = "neurologo";
        this.idMedicotratante = medico.getIdMedico();
        this.Profesiondelmedico = profesionalMedicina.getIdEspecialidad();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidad getProfesionalMedicina() {
        return profesionalMedicina;
    }

    public void setProfesionalMedicina(Especialidad profesionalMedicina) {
        this.profesionalMedicina = profesionalMedicina;
    }

    public int getIdDoctor() {
        return IdDoctor;
    }

    public void setIdDoctor(int IdDoctor) {
        this.IdDoctor = IdDoctor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdMedicotratante() {
        return idMedicotratante;
    }

    public void setIdMedicotratante(int idMedicotratante) {
        this.idMedicotratante = idMedicotratante;
    }

    public int getProfesiondelmedico() {
        return Profesiondelmedico;
    }

    public void setProfesiondelmedico(int Profesiondelmedico) {
        this.Profesiondelmedico = Profesiondelmedico;
    }
    
    
}
