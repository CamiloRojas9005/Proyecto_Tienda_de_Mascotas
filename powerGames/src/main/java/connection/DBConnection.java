package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {  //parametros de conexion a la base de datos 

    Connection connection;
    static String bd = "powergamer";
    static String port = "3307";
    static String login = "root";
    static String password = "Camilo#90";

    public DBConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");   // establcer conexion 
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexion Establecia");
        } catch (Exception ex)
        {
            System.out.println("Error en la conexion " + ex);
        }
    }

    public Connection getConnection() {  // si es correcto devuelve la conexion
        return connection;
    }

    public void desconectar() {    // desconecta devuelve null =)
        connection = null;
    }
    
}
