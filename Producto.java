/**
 * 
 * @author jenny
 *
 */


public class Producto {

	private String categoria;
	private int cantidad;
	private String descrip;
	 
	
	public Producto(String categoria, String descrip, int cantidad) {
		setCategoria(categoria);
		setCantidad(cantidad);
		setDescrip(descrip);
	}





	public String getCategoria() {
		return categoria;
	}






	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}






	public int getCantidad() {
		return cantidad;
	}






	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}






	public String getDescrip() {
		return descrip;
	}






	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}






	@Override
	public String toString() {
		return "Producto [categoria=" + categoria + ", cantidad=" + cantidad + ", descrip=" + descrip + "]";
	}
	
	public void subtract(int subtractQuantity){
	    this.cantidad -= subtractQuantity;
	  }
		
		
}