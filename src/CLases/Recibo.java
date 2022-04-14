
import java.util.Date;

/**
 *
 * @author BarriosJuan, LernaDaniel, TorresSebastian
 */
public class Recibo {

    //Atributos de la clase Recibo
    private Date diaDeCompra;
    private double Descuento;
    private Date Fecha;
    private Date Hora;
    //private String tipoDeFactura;
    private double saldoPendiente;
    private String nombreVendedor;

    //Metodos de la clase Recibo 
    public Date getDiaDeCompra() {
        return diaDeCompra;
    }

    public void setDiaDeCompra(Date diaDeCompra) {
        this.diaDeCompra = diaDeCompra;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
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

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
}
