package Helden;

public class Kampfregel {
	
	Wuerfel wuerfel = new Wuerfel(6);
	Monster monster = new Monster(10);
	Held held = new Held("Hero", 10);
	
	public void kampf()
	{
		if(held.getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Der Held hat verloren!");
			return;
		}
		
		if(monster.lebenspunkte<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Das Monster hat verloren!");
			return;
		}
		
		held.setAngrifswert(wuerfel.wuerfeln());
		monster.setAngrifswert(wuerfel.wuerfeln());
		if(held.getAngrifswert() > monster.getAngrifswert())
		{
			monster.setLebenspunkte(monster.getLebenspunkte()-1);
		}
		else
		{
			held.setLebenspunkte(held.getLebenspunkte()-1);
		}
		if(held.getLebenspunkte()<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Der Held hat verloren!");
			return;
		}
		
		if(monster.lebenspunkte<=0)
		{
			System.out.println("Das Spiel ist nun vorbei. Das Monster hat verloren!");
			return;
		}
	}
}
