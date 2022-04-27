package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematodes> nematodes = new ArrayList<Nematodes>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	
	void printNematodes()
    {
        for(Nematodes n:nematodes)
        {
            System.out.println(n);
        }
    }

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematodes n = new Nematodes(r);
            nematodes.add(n);
        }
	}


	public void draw()
	{	
	}
}
