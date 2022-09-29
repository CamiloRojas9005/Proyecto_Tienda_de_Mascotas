package beans;

public class Usuarios {
    
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String ciudad;
    private String direccion;

    public Usuarios(String username, String password, String nombre, String apellidos, String email, String telefono, String ciudad, String direccion) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    //////////////get
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    
     //////////////get
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "usuarios{" + "username=" + username + ", password=" + password + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    
    
}
