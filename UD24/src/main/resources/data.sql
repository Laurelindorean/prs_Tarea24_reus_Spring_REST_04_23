DROP TABLE IF EXISTS empleado;

CREATE TABLE empleado (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nomapels VARCHAR(250),
  trabajo VARCHAR(250),
  sueldo DECIMAL(10,2)
);

INSERT INTO empleado (nomapels, trabajo, sueldo) VALUES ('Palmira Romia', 'FullStack Developer', 2500.50);
INSERT INTO empleado (nomapels, trabajo, sueldo) VALUES ('Juan Pérez', 'System administrator', 3000.00);
INSERT INTO empleado (nomapels, trabajo, sueldo) VALUES ('Miguel Sastre', 'Analyst Programmer', 3150.89);
INSERT INTO empleado (nomapels, trabajo, sueldo) VALUES ('Encarna Segura', 'HelpDesk', 1280.57);
