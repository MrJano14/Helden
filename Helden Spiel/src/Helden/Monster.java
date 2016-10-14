package Helden;

public class Monster {
	int angrifswert;
	int lebenspunkte;
	
	public Monster(int lebenspunkte)
	{
		this.lebenspunkte=lebenspunkte;
	}
	
	public void setAngrifswert(int angrifswert) {
		this.angrifswert = angrifswert;
	}

	public void setLebenspunkte(int lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	public int getAngrifswert()
	{
		return angrifswert;
	}
	
	public int getLebenspunkte()
	{
		return lebenspunkte;
		
	}

}
