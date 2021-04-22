import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KDemo extends JFrame 
{
	JPDemo jp;
	KDemo()
	{
	jp= new JPDemo();
      add(jp);	
	}
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{
	ImageIcon img1,img2;
	Image swt,head;
	int x[]=new int[100];
	int y[]=new int[100];
	int dots=5;
	boolean start_game = false;
	//boolean left=false,right=true,up=false,down=false;
	//int r1=0;,r2=0;
	
      JPDemo()
	  {
	  x[0]=120;
	  y[0]=100;
	  
	  x[1]=100;
	  y[1]=100;
	  
	  x[2]=80;
	  y[2]=100;
	  
	  x[3]=60;
	  y[3]=100;
	  
	  x[4]=40;
	  y[4]=100;
	
    setBackground(Color.black);	
	  img1= new ImageIcon("swt.png");
	  swt=img1.getImage();
	   img2= new ImageIcon("head.png");
	  head=img2.getImage();
	  
	  Timer t=new Timer(120,this);
	  t.start();
	 addKeyListener(this);
	 setFocusable(true);
	  
	  //randomDemo();
}
public void paintComponent(Graphics g)	  
{
	super.paintComponent(g);
	
	//g.drawImage(food,r1,r2,this);
	
	  for(int i=0;i<dots;i++)
	  {
		  if(i==0)
		  {
		  g.drawImage(head,x[i],y[i],this);
	      }
	      else
		  {
			  g.drawImage(swt,x[i],y[i],this);
		  }
	  }
}
	  public void actionPerformed(ActionEvent e)
	  {
		  if(start_game)
		  {
		  for(int i=dots;i>0;i--)
		  {
		  x[i]=x[i-1];
		  y[i]=y[i-1];
		  }
		  x[0]=x[0]+20;
		  repaint();
	  }
	  }
	  public void keyReleased(KeyEvent e){}
	   public void keyPressed(KeyEvent e)
	   {
		   start_game=true;
	   }
	    public void keyTyped(KeyEvent e){}
	  
}
class Demo
{
	public static void main(String ar[])
	{
	KDemo n = new KDemo();
		n.setVisible(true);
		n.setSize(1000,1000);
		n.setLocation(200,50);
	}
}