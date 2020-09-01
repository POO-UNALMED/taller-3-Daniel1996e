package taller3.televisores;

public class Control {
	TV tv;
	
	void enlazar(TV tv) {
		this.tv = tv;
	}
	
	void turnOff() {
		tv.estado = false;
	}
	
	void setCanal(int canal) {
		tv.canal = canal;
	}
	
	void turnOn() {
		tv.estado = true;
	}
	
	void canalUp() {
		tv.canal ++;
	}
	
	void volumenUp(){
		tv.volumen ++;
	}
}
