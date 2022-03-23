
import java.util.Date;

/**
 *
 * @author BarriosJuan, LernaDaniel, TorresSebastian
 */
public class Factura {

    //Atributos de la clase Factura 
    private int idFactura;
    private int cantidadProducto;
    private String Ciudad;
    //Domicilio = Dirección donde se saco la factura
    private String Domicilio;
    private long numeroTelefonico;
    private long email;
    private String Observaciones;
    private String Vendedor;
    private Date Fecha;
    private Date Hora;
    /**
     * Se coloca como int, y se dara la opción en número del medio de pago
     * 1.(Credito), 2.(Contado) y 3.(Credito-Contado)
     */
    private int estadoCancelacion;
    //Cantidad de productos 
    private int cantidadProductos;
    //(opcional)
    //private imprimirFactura;

    //Metodos de la clase Factura
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public long getEmail() {
        return email;
    }

    public void setEmail(long email) {
        this.email = email;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }

    public int getEstadoCancelacion() {
        return estadoCancelacion;
    }

    public void setEstadoCancelacion(int estadoCancelacion) {
        this.estadoCancelacion = estadoCancelacion;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
}
