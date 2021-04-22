//emoji
import java.awt.*;
class SDemo extends Frame
{
	SDemo()
	{
		Font f = new Font("FOLD",Font.BOLD,40);
        setFont(f);
		
	}

public void paint(Graphics g)
{
	Color c = new Color(255,250,1);
	g.setColor(c);
	g.fillOval(50,50,400,400);
	g.setColor(Color.black);
	g.fillOval(150,150,80,50);
	g.fillOval(270,150,80,50);
	g.setColor(Color.red);
	g.fillRect(200,300,100,20);
	
}
}
class Surbhi
{
	public static void main(String args[])
	{
	SDemo e = new SDemo();
    e.setVisible(true);
	e.setSize(500,300);
	e.setLocation(400,400);
  	
		}
	
}