
/**
 *
 * @author BarriosJuan, LernaDaniel, TorresSebastian
 */
public class Producto {

    //Atributos de la clase Producto
    private int idProducto;
    private String Nombre;
    private double Precio;
    private String Categoria;

    //Metodos de la clase Producto
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
}
