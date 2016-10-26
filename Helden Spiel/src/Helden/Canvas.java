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
	String text = "";
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
		return new Dimension(400, 400);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		float x = getWidth();
		float y = getHeight();

		int average = (getWidth()+getHeight())/2;
		int size = average/4;
		float xFactor = x/200;
		float yFactor = y/200;
		
	//Setze Schriftgröße
		setFont(getFont().deriveFont((float) (average*0.03)));
		
	//Setze Hintergrundfarbe
		g.setColor(new Color(0,0,255));
		g.fillRect(0, 0, getWidth(), getHeight());
		
	//Setze Held Farbe/Image
		g.setColor(new Color(255, 0, 0));
 		g.drawImage(held, (int)(10*xFactor), (int)(100*yFactor), size, size, null);
		
	//Setze Held Leben
		g.drawString(""+kampfregel.held.getLebenspunkte(), (int)(60*xFactor), (int)(100*yFactor));
		
	//Setze Monster Leben
		g.drawString(""+kampfregel.monster.getLebenspunkte(), (int)(140*xFactor), (int)(100*yFactor));
		
	//Setze Monster Farbe/Image
		g.drawImage(monster, (int)(140*xFactor), (int)(100*yFactor), size, size, null);
		
		g.drawString(text, 10, 30);
		
		
		
		if(kampfregel.held.getLebenspunkte()<=0)
		{
			g.drawString("Der Held hat verloren", (int)(15*xFactor),(int)(15*yFactor));
		}
		
		if(kampfregel.monster.lebenspunkte<=0)
		{
			g.drawString("Das Monter hat verloren", (int)(15*xFactor),(int)(15*yFactor));
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
