package test;

import beans.videojuego;
import beans.Usuarios;
import beans.alquilerventa;

import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestBD {

    public static void main(String[] args) {
        actualizarJuego(2, "Este tambien es muy bueno");

    }

    public static void actualizarJuego(int id, String descripcion) {
        DBConnection con = new DBConnection();   // instanciar OBJETO
        //String sql = "Insert into Usuarios values('"+ username + "','" + password + ")";
        String sql = "UPDATE videojuego SET descripcion = ' " + descripcion + "' WHERE id =" + id;
        try
        {
            Statement st = con.getConnection().createStatement();  // conexion
            st.executeUpdate(sql);                                 //ejecuta el update para la base
            
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        } finally  //desconecta despues
        {
            con.desconectar();
        }
    }

//    public static void listarPelicula() {
//        DBConnection con = new DBConnection();   // instanciar OBJETO
//        String sql = "SELECT * FROM peliculas";
//        try
//        {
//            Statement st = con.getConnection().createStatement();  // conexion
//            ResultSet rs = st.executeQuery(sql);                   // ejecura el Query
//
//            while (rs.next())   // reccorre todos los campos y los traes dependiendo de la clase
//            {
//                int id = rs.getInt("id");
//                String titulo = rs.getString("titulo");
//                String genero = rs.getString("genero");
//                String autor = rs.getString("autor");
//                int copias = rs.getInt("copias");
//                boolean novedad = rs.getBoolean("novedad");
//
//                Peliculas pelicula = new Peliculas(id, titulo, genero, autor, copias, novedad);
//                System.out.println(pelicula.toString());
//
//            }
//        } catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        } finally  //desconecta despues
//        {
//            con.desconectar();
//        }
//    }
}
