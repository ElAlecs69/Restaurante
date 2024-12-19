package ordi_2;

public class Producto {

	private String nombre, descripcion;
	private double precioUnitario, porcentajeDeDescuento;
	
	public Producto(String n, String d, double pu, double pdd) {
		this.nombre = n;
		this.descripcion = d;
		this.precioUnitario = pu;
		this.porcentajeDeDescuento = pdd;
	}

	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public double getPorcentajeDeDescuento() {
		return porcentajeDeDescuento;
	}

	public double precioConDescuento() {
		return this.precioUnitario - (this.precioUnitario*this.porcentajeDeDescuento/100);
	}
	
}


