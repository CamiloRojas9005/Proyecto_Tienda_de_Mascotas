package beans;

public class videojuego {
    private int id;
    private String titulo;
    private String plataforma;
    private Boolean alquiler;
    private Boolean compra;
    private String categoria;
    private Double valor;
    private String genero;
    private int stock;
    private String descripcion;

    public videojuego(int id, String titulo, String plataforma, Boolean alquiler, Boolean compra, String categoria, Double valor, String genero, int stock, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.alquiler = alquiler;
        this.compra = compra;
        this.categoria = categoria;
        this.valor = valor;
        this.genero = genero;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Boolean getAlquiler() {
        return alquiler;
    }

    public Boolean getCompra() {
        return compra;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getValor() {
        return valor;
    }

    public String getGenero() {
        return genero;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setAlquiler(Boolean alquiler) {
        this.alquiler = alquiler;
    }

    public void setCompra(Boolean compra) {
        this.compra = compra;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "videojuego{" + "id=" + id + ", titulo=" + titulo + ", plataforma=" + plataforma + ", alquiler=" + alquiler + ", compra=" + compra + ", categoria=" + categoria + ", valor=" + valor + ", genero=" + genero + ", stock=" + stock + ", descripcion=" + descripcion + '}';
    }

    
    
    
    
}
