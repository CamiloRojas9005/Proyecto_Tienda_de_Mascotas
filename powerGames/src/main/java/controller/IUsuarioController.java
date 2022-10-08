
package controller;

public interface IUsuarioController {
    
    public String login(String username, String password);
    
    public String register(String username, String password, String nombre, String apellidos, String email, String telefono, String ciudad, String direccion);
    
    public String pedir(String username);
    
    public String eliminar(String username);
    
    public String modificar(String username, String newPassword, String newNombre, String newApellidos, String newEmail, String newTelefono, String newCiudad, String newDireccion);
    
    
}
