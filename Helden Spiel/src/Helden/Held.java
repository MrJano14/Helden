package Helden;

public class Held {
	String name;
	int staerke;
	int angrifswert;
	int lebenspunkte;
	
	public Held(String name, int lebenspunkte)
	{
		this.name=name;
		this.lebenspunkte=lebenspunkte;
		
	}

	public int getAngrifswert() 
	{
		return angrifswert;
	}

	public void setAngrifswert(int angrifswert) 
	{
		this.angrifswert = angrifswert;
	}

	public int getLebenspunkte() 
	{
		return lebenspunkte;
	}

	public void setLebenspunkte(int lebenspunkte) 
	{
		this.lebenspunkte = lebenspunkte;
	}
	

}

