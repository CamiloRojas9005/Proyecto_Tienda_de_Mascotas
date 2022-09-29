
package controller;

public interface IUsuarioController {
    
    public String login(String username, String password);
    
    public String register(String username, String password, String nombre, String apellidos, String email, String telefono, String ciudad, String direccion);
    
}
