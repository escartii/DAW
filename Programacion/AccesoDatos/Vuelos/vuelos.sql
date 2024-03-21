-- Crear la base de datos
CREATE DATABASE sistema_reservas_vuelos;

-- Usar la base de datos recién creada
USE sistema_reservas_vuelos;

-- Crear tabla Vuelos
CREATE TABLE Vuelos (
    id_vuelo INT PRIMARY KEY,
    numero_vuelo VARCHAR(20) NOT NULL,
    origen VARCHAR(50) NOT NULL,
    destino VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    capacidad INT NOT NULL
);

-- Crear tabla Pasajeros
CREATE TABLE Pasajeros (
    id_pasajero INT PRIMARY KEY,
    numero_pasaporte VARCHAR(20) NOT NULL,
    nombre_pasajero VARCHAR(100) NOT NULL
);

-- Crear tabla Vuelos_Pasajeros
CREATE TABLE Vuelos_Pasajeros (
    id_vuelo INT,
    id_pasajero INT,
    n_asiento INT,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_pasajero) REFERENCES Pasajeros(id_pasajero),
    PRIMARY KEY (id_vuelo, id_pasajero)
);
