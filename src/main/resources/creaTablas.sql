/*Se crea la base de datos */
drop schema if exists chemas;
drop user if exists usuario_prueba;
CREATE SCHEMA chemas ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_prueba'@'%' identified by 'Usuario_Clave.';

/*Se asignan los prvilegios sobr ela base de datos Chemas al usuario creado */
grant all privileges on chemas.* to 'usuario_prueba'@'%';
flush privileges;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE chemas.usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(512) NOT NULL,
  nombre VARCHAR(20) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  correo VARCHAR(25) NULL,
  telefono VARCHAR(15) NULL,
  ruta_imagen varchar(1024),
  activo boolean,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

 /*  Chemas  */
 
 /*Tabla para almacenar las tallas de chemas*/
 CREATE TABLE chemas.tallas (
 idTalla INT NOT NULL AUTO_INCREMENT,
 nombreTalla CHAR,
UNIQUE KEY (`nombreTalla`),
PRIMARY KEY (`idTalla`))
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

 /*Tabla para almacenar el tipo de chema "Euro Copa - Copa America - Club deportivo"*/
CREATE TABLE chemas.tipo (
idTipo INT NOT NULL AUTO_INCREMENT,
nombreTipo VARCHAR(50) NOT NULL,
UNIQUE KEY (`nombreTipo`),
PRIMARY KEY (`idTipo`))
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;

/*Tabla para almacenar la información de las chemas*/
CREATE TABLE chemas.chemas (
 id_Chema INT NOT NULL AUTO_INCREMENT,
 precio INT NOT NULL,
 talla  VARCHAR(50) NOT NULL,
 tipo  VARCHAR(50) NOT NULL, 
 ruta_imagen VARCHAR(1024),
 PRIMARY KEY (`id_Chema`),
 CONSTRAINT fk_talla FOREIGN KEY (talla) REFERENCES chemas.tallas(nombreTalla),
 CONSTRAINT fk_tipo FOREIGN KEY (tipo) REFERENCES chemas.tipo(nombreTipo)
 ) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb4;
 
 /*Ingreso de información a las tablas*/
 
 /*Tallas*/
INSERT INTO chemas.tallas (nombreTalla) VALUES ('S');
INSERT INTO chemas.tallas (nombreTalla) VALUES ('M');
INSERT INTO chemas.tallas (nombreTalla) VALUES ('L');

/*Tipo*/
INSERT INTO chemas.tipo (nombreTipo) VALUES ('Euro Copa');
INSERT INTO chemas.tipo (nombreTipo) VALUES ('Copa America');
INSERT INTO chemas.tipo (nombreTipo) VALUES ('Club deportivo');


/*Chemas*/
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('54','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Brasil-Copa-America-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('907868000','M','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Brasil-Copa-America-2024-5.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('7','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Paraguay-Copa-America-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('9007500','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Colombia-Copa-America-2024-5.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('900556400','L','Copa America','https://todosobrecamisetas.com/wp-content/uploads/A-Camiseta-Argentina-Copa-America-2024-1-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Paraguay-Copa-America-2024-5.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','L','Copa America','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Costa-Rica-Copa-America-2024-5.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/C-Camiseta-Estados-Unidos-Copa-America-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Copa America','https://todosobrecamisetas.com/wp-content/uploads/C-Camiseta-Uruguay-Copa-America-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','M','Copa America','https://todosobrecamisetas.com/wp-content/uploads/C-Camiseta-Panama-Copa-America-2024-1.jpg');

INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','M','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/A-Camiseta-Alemania-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','M','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/A-Camiseta-Escocia-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/A-Camiseta-Hungria-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/A-Camiseta-Suiza-EURO-2024-1-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/B-Camiseta-Espana-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','L','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/B-Camiseta-Italia-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','L','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/B-Camiseta-Albania-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','L','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/C-Camiseta-Inglaterra-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','S','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/D-Camiseta-Francia-EURO-2024-1.jpg');
INSERT INTO chemas.chemas (precio,talla,tipo,ruta_imagen) VALUES ('90000','M','Euro Copa','https://todosobrecamisetas.com/wp-content/uploads/E-Camiseta-Belgica-EURO-2024-1.jpg');

/*TABLAS A ELIMINAR*/
create table chemas.informacion (
  id_informacion INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(30) NOT NULL,
  activo bool,
  PRIMARY KEY (id_informacion))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
