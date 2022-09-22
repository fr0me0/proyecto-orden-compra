import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProductos;

    private static int ultimoIdentificador;

    public OrdenCompra() {
        this.identificador = ++ultimoIdentificador;
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProducto() {
        return productos;
    }

    public static int getUltimoIdentificador() {
        return ultimoIdentificador;
    }

    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public double granTotal(){
        int total = 0;
        for (Producto p: productos){
            total += p.getPrecio();
        }

        return total;
    }

}
