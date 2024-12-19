package ordi_2;

public class OrdenPorComensal {

	private int cantidad;
	private Producto producto;
	
	public OrdenPorComensal(Producto p, int c) {
		this.producto = p;
		this.cantidad = c;
	}
	
	public Producto getProducto() {
		return this.producto;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public double total() {
		return cantidad * producto.precioConDescuento();
	}
	
}
