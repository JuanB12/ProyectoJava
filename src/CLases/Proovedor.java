
/**
 *
 * @author BarriosJuan, LernaDaniel, TorresSebastian
 */
public class Proovedor {
    
    //Atributos de la case proovedor
    private int idProovedor;
    private String nombreProovedor;
    private long Telefono; 
    
    //Metodos de la clase proovedor
    public int getIdProovedor() {
        return idProovedor;
    }

    public void setIdProovedor(int idProovedor) {
        this.idProovedor = idProovedor;
    }

    public String getNombreProovedor() {
        return nombreProovedor;
    }

    public void setNombreProovedor(String nombreProovedor) {
        this.nombreProovedor = nombreProovedor;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }   
}
