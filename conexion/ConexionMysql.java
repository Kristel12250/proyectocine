package conexion;   // Paquete donde está la clase

import java.sql.Connection;   // Importa la clase Connection para conectarse a la BD
import java.sql.DriverManager; // Para crear la conexión
import java.sql.SQLException;  // Para manejar errores de conexión

public class ConexionMysql {   
   Connection cn;   // Variable para guardar la conexión

    // Método que retorna una conexión con la base de datos MySQL
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/peliculas_cine","root","");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            cn=null;

        } 
        return cn;
    }
}
