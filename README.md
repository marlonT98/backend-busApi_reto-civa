# 🚌 API REST de Buses 
(reto civa)

Este proyecto es una API REST desarrollada con Spring Boot 3 y Java 21+ para gestionar buses y sus marcas. Incluye autenticación con Basic Auth, paginación y estructura limpia siguiendo buenas prácticas.

---

## 🧱 Tecnologías utilizadas

- Java 21+
- Spring Boot 3
- Spring Data JPA
- Spring Security (Basic Auth)
- MySQL
- Maven

---

## 🗃️ Configuración de la base de datos

### 1. Crear base de datos

Primero, crea la base de datos llamada `busesdb` en tu servidor MySQL:

```sql

CREATE DATABASE busesdb;
-- creamos las dos tablas
CREATE TABLE marca (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE buses (
 id int auto_increment primary KEY,
 numero_bus varchar(20) not null,
 placa VARCHAR(15) NOT NULL,
 fecha_creacion TIMESTAMP NOT NULL,
 caracteristicas TEXT,
 estado ENUM('ACTIVO', 'INACTIVO') DEFAULT 'ACTIVO',

   marca_id INT,
FOREIGN KEY (marca_id) REFERENCES marca(id)

);

-- insertamos datas para las pruebas

-- Insertar marcas
INSERT INTO marca (nombre) VALUES ('Volvo'), ('Scania'), ('Fiat');

-- Insertar buses (suponiendo que ya existen marcas con IDs 1, 2, 3)
INSERT INTO buses (numero_bus, placa, caracteristicas, estado, marca_id)
VALUES  ('001', 'ABC-123', 'Bus cómodo y amplio', 'ACTIVO', 1),
        ('002', 'XYZ-456', 'Bus económico', 'INACTIVO', 2),
		('002', 'XYZ-456', 'Bus económico', 'INACTIVO', 2),
		('001', 'ABC-679', 'Bus cómodo y amplio', 'ACTIVO', 3),
		('006', 'ABC-128', 'Bus cómodo y amplio', 'ACTIVO', 1),
		('088', 'ABC-120', 'Bus cómodo y amplio', 'ACTIVO', 2),
		('007', 'ABC-100', 'Bus cómodo y amplio', 'ACTIVO', 3),
		('006', 'ABC-128', 'Bus cómodo y amplio', 'ACTIVO', 1),
		('088', 'ABC-120', 'Bus cómodo y amplio', 'ACTIVO', 2),
		('007', 'ABC-100', 'Bus cómodo y amplio', 'ACTIVO', 3);

```

👨‍💻 Autor
Marlon Tarrillo

