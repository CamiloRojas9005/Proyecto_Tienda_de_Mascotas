package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Usuarios;
import connection.DBConnection;
import java.util.HashMap;
import java.util.Map;


public class UsuarioController implements IUsuarioController{

    
    @Override
    public String login(String username, String password){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        //Query
        String sql = "Select * from usuarios where username = '" + username + "'and password = '" + password + "'";
        try
        {
           Statement st = con.getConnection().createStatement();
           ResultSet rs =st.executeQuery(sql);
           while(rs.next())//revison hasta que encuentre final 
           {
               String nombre = rs.getString("nombre");
               String apellidos = rs.getString("apellidos");
               String email = rs.getString("email");
               String telefono = rs.getString("telefono");
               String ciudad = rs.getString("ciudad");
               String direccion = rs.getString("direccion");
               
               Usuarios usuario = new Usuarios(username, password, nombre, apellidos, email, telefono, ciudad, direccion);
               return gson.toJson(usuario);
           }
        } 
        catch (Exception ex) 
        {
            System.out.println("Login..:: " + ex.getMessage());
        } 
        finally
        {
           con.desconectar();
        }
        
        
        
    return "false"; 
    }
    
    @Override
    public String register(String username, String password, String nombre, String apellidos, String email, String telefono, String ciudad, 
            String direccion) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuarios values('" + username + "', '" + password + "', '" + nombre
                + "', '" + apellidos + "', '" + email  + "', '" + telefono +  "', '" + ciudad 
                + "', '" + direccion +"'"+ ")";
        
        try
        {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuarios usuario = new Usuarios(username, password, nombre, apellidos, email, telefono, ciudad, direccion);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage() + "Error en query insert..");

        } finally
        {
            con.desconectar();
        }

        return "false";
    }
}
