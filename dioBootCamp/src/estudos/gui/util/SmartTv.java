package estudos.gui.util;

public class SmartTv {
	
	public boolean ligada = false;
	public int canal = 1;
	public int volume = 25;
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		++volume;
	}
	public void abaixarVolume() {
		--volume;
	}
	
	
}
