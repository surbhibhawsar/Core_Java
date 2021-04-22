
//program to draw flag
import java.awt.*;
class GDemo extends Frame
{
 GDemo()
 {
   Font f = new Font("FOLD",Font.BOLD,40);
   setFont(f);
  
 }	 

public void paint(Graphics g)
{
	
	g.drawRect(50,50,50,500);//dandi
	Color c = new Color(234,43,21);
	g.setColor(c);
	g.fillRect(100,50,250,60);//1 box
		 
	     g.setColor(Color.white);
         g.fillRect(100,110,250,60);//2 box
		 Color c1 = new Color(0,65,0);
	     g.setColor(c1);
         g.fillRect(100,170,250,60);//3 box
		 g.drawOval(200,115,50,60-8);//chakra
		 
		 
		 g.drawOval(225,140,5,7);//inside chakra
		 g.drawRect(40,550,70,20);//down side
		 g.drawRect(30,570,90,20);//down side
		 g.drawRect(20,590,110,20);//down side
		 
}
}
class Demo
{
public static void main(String ar[])
{
GDemo a = new GDemo();
a.setVisible(true);
a.setSize(500,300);
a.setLocation(100,200);

System.out.println("by surbhi bhawsar");
}	
	
}