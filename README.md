# proyectocine.
# Proyecto Sistema de Películas

## Descripción
Este proyecto es una aplicación Java desarrollada en NetBeans IDE 22 para gestionar información de películas y cines, conectándose a una base de datos MySQL.

Incluye:
- Conexión a base de datos MySQL usando JDBC con el conector **MySQL Connector/J 9.4.0**.
- Uso de MySQL Admin para administración de base de datos.
- Clases que modelan las entidades y permiten operaciones CRUD básicas.
- Interacción por consola para manejar los datos.

## Tecnologías usadas
- Java (JDK 8 o superior)
- NetBeans IDE 22
- MySQL (Servidor local)
- MySQL Connector/J 9.4.0 para la conexión JDBC
- MySQL Admin para administración de base de datos
- Consola para interacción con usuario

## Claves de acceso a la base de datos

- Usuario: `root`
- Contraseña: (vacía)
- Base de datos: `peliculas_cine`
- Host: `localhost`
- Puerto: `3306`

> **Nota:** Es necesario tener instalado MySQL y configurado correctamente, además de tener el conector MySQL JDBC versión 9.4.0 añadido en el proyecto.

## Estructura del proyecto

- `/Actividad1_SistemaPeliculas/`: Código fuente Java de la actividad 1.
- `/Videos/`: Video explicativo mostrando el desarrollo y funcionamiento.
- `/Informe/`: Documento PDF con capturas y explicación del proyecto.

## Cómo ejecutar

1. Instalar y configurar MySQL Server con base de datos `peliculas_cine`.
2. Configurar el usuario `root` sin contraseña o actualizar `ConexionMysql.java` si cambia.
3. Importar el conector MySQL Connector/J 9.4.0 en NetBeans.
4. Abrir el proyecto en NetBeans IDE 22.
5. Compilar y ejecutar la aplicación.
6. Usar la consola para agregar y mostrar películas y cines.


## Video Explicativo
🔗 [Ver video en YouTube](https://youtu.be/dC_vnWP3QOU)


¡Gracias por revisar este proyecto!

