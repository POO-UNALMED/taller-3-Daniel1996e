package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void setCanal(int canal) {
		tv.canal = canal;
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void canalUp() {
		tv.canal ++;
	}
	
	public void volumenUp(){
		tv.volumen ++;
	}
}
