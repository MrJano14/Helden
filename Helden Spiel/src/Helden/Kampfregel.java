package Helden;

import java.awt.Color;

public class Kampfregel {
	
	Wuerfel wuerfel = new Wuerfel(6);
	Wuerfel wuerfel_Waffe = new Wuerfel(2);
	Monster monster = new Monster(10);
	Held held = new Held ("Hero", 10);
	Window window;
	
	public Kampfregel(Window window) 
	{
		this.window = window;
	}
	
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
			int schaden=wuerfel_Waffe.wuerfeln();
			monster.setLebenspunkte(monster.getLebenspunkte()-schaden);
			if(schaden == 1)
			{
				System.out.println("Die Waffe wurde nicht verwendet");
				window.getCanvas().setText("Die Waffe wurde nicht verwendet");
			}
			
			else
			{
				System.out.println("Die Waffe wurde von dem Held benutzt!");
				window.getCanvas().setText("Die Waffe wurde verwendet! Der Schaden wurde verdoppelt!!!");
			}
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
