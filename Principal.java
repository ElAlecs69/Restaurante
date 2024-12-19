package ordi_2;

public class Principal {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("tacos", "tacos con salsa", 89.99, 40);
		Producto p2 = new Producto("birria", "picosa", 150, 20);
		Producto p3 = new Producto("sopa", "caldosa", 57.35, 70);

		Comanda c = new Comanda(5, 1);
		
		OrdenPorComensal o1 = new OrdenPorComensal(p1, 1);
		OrdenPorComensal o2 = new OrdenPorComensal(p2, 3);
		OrdenPorComensal o3 = new OrdenPorComensal(p3, 2);
		
		c.aggOrdenes(o1);
		c.aggOrdenes(o2);
		c.aggOrdenes(o3);
		
		System.out.println("Detalles");
		for(OrdenPorComensal opc : c.getOrdenes()) {
			System.out.println(opc.getCantidad() + "|" + opc.getProducto().getNombre() + "|" + opc.total());
		}
		System.out.println("total: "+ c.totalComanda());
	}

}
