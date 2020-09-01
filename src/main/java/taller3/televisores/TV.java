package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 1;
	boolean estado;
	int volumen = 500;
	Control control;
	static int numTV;
	
	TV (Marca marc, boolean est){
		marca = marc;
		estado = est;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public void setCanal (int canal) {
		this.canal = canal;
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public int getPrecio(){
		return this.precio;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
}
