package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void setCanal(int canal) {
		if(tv.estado = true & canal > 0 & canal <= 120) {
		tv.canal = canal;
		}
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void canalUp() {
		if(tv.estado = true & tv.canal < 120) {
		tv.canal ++;
		}
	}
	
	public void canalDown() {
		if(tv.estado = true & tv.canal > 0) {
		tv.canal --;
		}
	}
	
	public void volumenUp(){
		if(tv.estado = true & tv.volumen < 7) {
			tv.volumen ++;
		}
	}
	
	public void volumenDown(){
		if(tv.estado = true & tv.volumen > 1) {
			tv.volumen --;
		}
	}
	
	public TV getTv() {
		return this.tv;
	}
}
