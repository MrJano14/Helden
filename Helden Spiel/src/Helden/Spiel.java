package Helden;

public class Spiel 
	{
	Kampfregel kampfregel;
	Window window;
	
	public Spiel(Window window) 
	{
		this.window = window;
		kampfregel = new Kampfregel(window);
	}
	public Kampfregel getKampfregel() {
		return kampfregel;
	}
	public void setKampfregel(Kampfregel kampfregel) {
		this.kampfregel = kampfregel;
	}
	
	

}
