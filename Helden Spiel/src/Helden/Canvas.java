package Helden;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Canvas extends JPanel 
{ 
	private static final long serialVersionUID = 1L;
	
	Kampfregel kampfregel;
	BufferedImage held;
	BufferedImage monster;
	
	public Canvas(Kampfregel kampfregel)
	{
		this.kampfregel = kampfregel;
		try {
			held = ImageIO.read(Canvas.class.getResource("../images/Held_1.png"));
			monster = ImageIO.read(Canvas.class.getResource("../images/Cute-Monster.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(200, 200);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		int factor = 50/(getWidth()/4);
		int width = 50*factor;
		
	//Setze Hintergrundfarbe
		g.setColor(new Color(0,0,255));
		g.fillRect(0, 0, 200, 200);
		
	//Setze Held Farbe/Image
		g.setColor(new Color(255, 0, 0));
		g.drawImage(held, 10, 100, 50, 50, null);
		
	//Setze Held Leben
		g.drawString(""+kampfregel.held.getLebenspunkte(), 60, 100);
		
	//Setze Monster Leben
		g.drawString(""+kampfregel.monster.getLebenspunkte(), 140, 100);
		
	//Setze Monster Farbe/Image
		g.drawImage(monster, 140, 100, 50, 50, null);
		
		
		if(kampfregel.held.getLebenspunkte()<=0)
		{
			g.drawString("Der Held hat verloren", 15,15);
		}
		
		if(kampfregel.monster.lebenspunkte<=0)
		{
			g.drawString("Das Monter hat verloren", 15,15);
		}
	}
	
}
