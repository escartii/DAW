-- Crear la base de datos
CREATE DATABASE Vuelos;

-- Usar la base de datos recién creada
USE Vuelos;

-- Crear tabla Vuelos
CREATE TABLE Vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(20) NOT NULL,
    origen VARCHAR(50) NOT NULL,
    destino VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    capacidad INT NOT NULL
);

-- Crear tabla Pasajeros
CREATE TABLE Pasajeros (
    id_pasajero INT AUTO_INCREMENT PRIMARY KEY,
    numero_pasaporte VARCHAR(20) NOT NULL,
    nombre_pasajero VARCHAR(100) NOT NULL
);

-- Crear tabla Vuelos_Pasajeros
CREATE TABLE Vuelos_Pasajeros (
    id_Vuelos_Pasajeros INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo INT AUTO_INCREMENT,
    id_pasajero INT AUTO_INCREMENT,
    n_asiento INT,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero),
    PRIMARY KEY (id_vuelo, id_pasajero)
);
