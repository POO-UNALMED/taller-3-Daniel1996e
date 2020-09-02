package taller3.televisores;

public class TV {
	public Marca marca;
	int canal = 1;
	int precio = 500;
	public boolean estado;
	int volumen = 1;
	public Control control;
	public static int numTV;
	
	public TV (Marca marc, boolean est){
		marca = marc;
		estado = est;
		numTV ++;
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
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void setVolumen (int volumen) {
		if(this.estado == true & volumen > 0 & volumen <= 7) {
			this.volumen = volumen;
			}
	}
	
	public void setCanal(int canal) {
		if(this.estado == true & canal > 0 & canal <= 120) {
		this.canal = canal;
		}
	}
	
	public void volumenUp(){
		if(this.estado == true & this.volumen < 7) {
			this.volumen ++;
		}
	}
	
	public void volumenDown(){
		if(this.estado == true & this.volumen > 1) {
			this.volumen --;
		}
	}
	
	public void canalUp() {
		if(this.estado == true & this.canal < 120) {
		this.canal ++;
		}
	}
	
	public void canalDown() {
		if(this.estado = true & this.canal > 0) {
		this.canal --;
		}
	}
	
	public static  void setNumTV(int num) {
		TV.numTV = num;
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
	
	public Control getControl() {
		return this.control;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
}
