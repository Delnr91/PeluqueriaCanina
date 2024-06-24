# Proyecto APP Java con CRUD Y JPA

## Descripción

Bienvenido a la Aplicación de Gestión de Mascotas de Peluquería Canina. Esta aplicación basada en Java utiliza JPA (Java Persistence API) para gestionar y almacenar la información de las mascotas de los clientes. El sistema te permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar).

## Estructura del Proyecto
Proyecto desarrollado en Java utilizando Java Swing para la interfaz gráfica y JPA (Java Persistence API) para la conexión con una base de datos MySQL. El objetivo principal del proyecto es demostrar un CRUD básico (Crear, Leer, Actualizar, Borrar) implementado en una aplicación de gestión.

## Tecnologías Utilizadas

Java Swing: Framework para el desarrollo de interfaces gráficas en aplicaciones de escritorio en Java.
JPA (Java Persistence API): API estándar de Java para el mapeo objeto-relacional y la gestión de la persistencia en la capa de datos.
MySQL: Sistema de gestión de bases de datos relacional ampliamente utilizado.

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase/javase7-archive-downloads.html)
- [MySQL Server](https://www.mysql.com/)
- [NetBeans IDE](https://netbeans.apache.org/)

## Configuración del Proyecto
Crea las clases Mascotas y Dueño con sus atributos: 
- Mascotas: num_clinte, nombre_mascota, raza, color, alergico, atencion_especial.
- Dueño:id_dueño, nombre, celular, direccion

Crea la relacion de un dueño puede tener muchas mascotas con la anotacion @OneToMany

Crea una base de datos MySQL con el nombre peluqueria_canina  y configura las credenciales de acceso en el archivo de configuración correspondiente (persistence.xml o similar).

Crea la interfaz grafica con Swing de acorde al video de mi resolucion del proyecto 

[![Tutorial](https://img.youtube.com/vi/RR6l50zRlQo/0.jpg)](https://youtu.be/RR6l50zRlQo)

[Resolucion de la App](https://youtu.be/RR6l50zRlQo)


## 1. Clonar el Repositorio

Clona el repositorio en tu máquina local usando el siguiente comando:

```bash
git clone https://github.com/Delnr91/PeluqueriaCanina.git
PeluquriaCanina
```

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.

2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).

3. Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva funcionalidad'`).

4. Empuja la rama (`git push origin feature/nueva-funcionalidad`).

5. Abre un Pull Request.

   
## Contacto

Para cualquier duda o consulta, por favor contacta a:

- **Nombre**: [Daniel Núñez Rojas]
- **Email**: [invdesdelnr@outlook.com]
- **LinkedIn**: [www.linkedin.com/in/delnr91]
- **YouTube** : [https://www.youtube.com/@invdesdev33]
