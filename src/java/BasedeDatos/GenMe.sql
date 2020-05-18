drop schema if exists GenMe;
create database GenMe;
use GenMe;
CREATE TABLE Medico (
IdMedico INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL
);
CREATE TABLE Especialista (
IdEspecialista INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL,
descripcion VARCHAR(30) NOT NULl
);
CREATE TABLE Doctor (
IdDoctor INT NOT NULL PRIMARY KEY auto_increment,
IdMedico INT NOT NULL,
IdEspecialista INT NOT NULL
);

CREATE TABLE Medicamento (
IdMedicamento INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL,
posologia VARCHAR(30) NOT NULl,
Dosis int not null,
ViaAdministra VARCHAR(30) NOT NULL   
);

CREATE TABLE EPS (
idEPS INT NOT NULL PRIMARY KEY auto_increment,   
nitEps  INT NOT NULL,
nombre   VARCHAR(30) NOT NULL
);
CREATE TABLE Enfermedad (
idEnfermedad INT NOT NULL PRIMARY KEY auto_increment,   
nombre   VARCHAR(30) NOT NULL,
descripcion  VARCHAR(30) NOT NULL
);

CREATE TABLE Usuario (
    idUsuario INT NOT NULL PRIMARY KEY auto_increment,    
    cedula int not null,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    sangre VARCHAR(30) NOT NULL,
    condicion boolean
);
CREATE TABLE Paciente (
IdPaciente INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL,
idUsuario INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE tutor (
IdPaciente INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL,
idUsuario INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE PacienteL (
IdPaciente INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL
);

CREATE TABLE formulaMedica (
IdformulaMedica INT NOT NULL PRIMARY KEY auto_increment,
IdPaciente INT NOT NULL ,
idEnfermedad INT NOT NULL ,
IdMedicamento INT NOT NULL,
FOREIGN KEY (IdPaciente) REFERENCES Paciente (IdPaciente),
FOREIGN KEY (idEnfermedad) REFERENCES Enfermedad (idEnfermedad),
FOREIGN KEY (IdMedicamento) REFERENCES Medicamento (IdMedicamento)

);