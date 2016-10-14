package Helden;

public class Wuerfel
{
    // Bezugsobjekte
 
    // Attribute
    private int anzahlSeiten;
     
    // Konstruktor ohne Parameter erzeugt einen Würfel mit 6 Seiten
    public Wuerfel()
    {
        anzahlSeiten=6;        
    }
     
    // Zweiter Konstruktor mit Parameter erzeugt einen Würfel mit einer beliebigen Seitenanzahl
    public Wuerfel(int pAnzahlSeiten)
    {
        anzahlSeiten=pAnzahlSeiten;
    }
     
    public int wuerfeln()
    {
        int zufallszahl;
        zufallszahl = (int)(Math.random() * anzahlSeiten)+1; 
        return zufallszahl;
    }
     
   }