package ordi_2;

import java.util.ArrayList;
import java.util.List;

public class Comanda {

	private List<OrdenPorComensal> ordenes;
	private int numMesa, numComanda;
	
	public Comanda(int nm, int nc) {
		this.numComanda = nc;
		this.numMesa = nm;
		this.ordenes = new ArrayList<>();
	}
	
	public List<OrdenPorComensal> getOrdenes(){
		return this.ordenes;
	}
	
	public int getNumMesa() {
		return this.numMesa;
	}
	
	public int getNumComanda() {
		return this.numComanda;
	}
	
	public void aggOrdenes(OrdenPorComensal o) {
		ordenes.add(o);
	}
	
	public double totalComanda() {
		double t = 0;
		for(OrdenPorComensal o : ordenes) {
			t += o.total();
		}
		
		return t;
	}
}
