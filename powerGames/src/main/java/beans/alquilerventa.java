package beans;
import java.util.Date;

public class alquilerventa {
    
    private int id;
    private String username;
    private Date fecha;
    private Double precioTotal;
    private Boolean compra;
    private Boolean alquiler;  

    public alquilerventa(int id, String username, Date fecha, Double precioTotal, Boolean compra, Boolean alquiler) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
        this.compra = compra;
        this.alquiler = alquiler;
    }
    //************************Get*******************************************************************************

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Date getFecha() {
        return fecha;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public Boolean getCompra() {
        return compra;
    }

    public Boolean getAlquiler() {
        return alquiler;
    }

    public void setId(int id) {
        this.id = id;
    }

    //**************************Set******************************************************************************
    public void setUsername(String username) {
        this.username = username;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setCompra(Boolean compra) {
        this.compra = compra;
    }

    public void setAlquiler(Boolean alquiler) {
        this.alquiler = alquiler;
    }

    //********************************************toString**************************************************************
    
    @Override
    public String toString() {
        return "alquilerventa{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", precioTotal=" + precioTotal + ", compra=" + compra + ", alquiler=" + alquiler + '}';
    }
    
}


