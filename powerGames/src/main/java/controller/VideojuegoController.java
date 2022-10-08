
package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import beans.videojuego;
import connection.DBConnection;

public class VideojuegoController {
 
   public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from videojuego";

        if (ordenar == true) {
            sql += " order by genero " + orden;
        }

        List<String> videojuego = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String plataforma = rs.getString("plataforma");
                boolean alquiler = rs.getBoolean("alquiler");
                boolean compra =  rs.getBoolean("compra");
                String categoria = rs.getString("categoria");
                double valor = rs.getDouble("valor");
                String genero = rs.getString("genero");
                int stock = rs.getInt("stock");
                String descripcion = rs.getString("descripcion");
                
                videojuego juego = new videojuego(id, titulo, plataforma, alquiler, compra, categoria, valor, genero, stock, descripcion);
                videojuego.add(gson.toJson(juego));
                
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "Fallo listar videojuego" );
        } finally {
            con.desconectar();
        }
        return gson.toJson(videojuego);
       
    }
    
}
