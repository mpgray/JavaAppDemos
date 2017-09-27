package labBuilding;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int[] RGBarray;
		int windowX;
		int windowY;
		RGBarray = new int[3];
		RGBarray = randRGB();

		//The building with a random color
		g.setColor(new Color(RGBarray[0], RGBarray[1], RGBarray[2]));
		g.fillRect(20, 10, 350, 450);

		//Create 6 windows with random Colors
		windowX = 50;
		windowY = 40;
		for(int x=0; x<6; x++){
			RGBarray = randRGB();
			g.setColor(new Color(RGBarray[0], RGBarray[1], RGBarray[2]));			
			g.fillRect(windowX, windowY, 100, 100);
			
			//Draws on the window pane
			RGBarray = randRGB();
			g.setColor(new Color(RGBarray[0], RGBarray[1], RGBarray[2]));			
			g.drawLine(windowX+50,windowY,windowX+50,windowY+99);
			g.drawLine(windowX,windowY+50,windowX+99,windowY+50);
			
			if(x!=2){
				windowY = windowY + 150;
			}
			else
			{
				windowX = 240;
				windowY = 40;
			}


		}
	}
	private int[] randRGB(){
		
		//Creates 3 random integers in an array between 1 and 255
		//with Red being field 0 Green being field 1 and Blue being field 2
		int[] arrayColor;
		arrayColor = new int[3];
		Random randColor = new Random();
		for (int x=0; x<3; x++){
			arrayColor[x] = randColor.nextInt(256);
		}
		return arrayColor;		
	}

	
}
