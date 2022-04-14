
/**
 *
 * @author BarriosJuan, LernaDaniel, TorresSebastian
 */
public class Cliente {

    //Atributos de la clase Cliente
    private int idCliente;
    /**
     * Se coloca como int, y se dara la opción en número del medio de pago
     * 1.(Credito), 2.(Contado) y 3.(Credito-Contado)
     */
    private int medioPago;

    //Metodos de la clase Cliente
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(int medioPago) {
        this.medioPago = medioPago;
    }
}
