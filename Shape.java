import java.awt.*;
import java.awt.event.*;
class Shape extends Frame implements ActionListener
{ 
Button b1,b2,b3;
boolean a= false;
boolean b= false;
boolean c= false;

     Shape()
	 {
		 Font f = new Font("FOLD",Font.BOLD,30);
		setFont(f);
		setBackground(Color.white);
		setLayout(null);
		
		b1 = new Button("arc");
		b1.setSize(100,100);
		b1.setLocation(200,100);
		add(b1);
		b2 = new Button("oval");
		b2.setSize(100,100);
		b2.setLocation(300,100);
		add(b2);
		b3 = new Button("rect");
		b3.setSize(100,100);
		b3.setLocation(400,100);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		if(a)
		{
	    Color c= new Color(0,255,254);
        g.setColor(Color.red);		
		g.fillArc(100,250,100,50,90,270);
		}
		if(b)
		{
		Color c1= new Color(5,124,254);
        g.setColor(c1);
		g.fillOval(100,350,100,50);
		}
		if(c)
		{
		Color c2= new Color(30,180,124);
        g.setColor(c2);
		g.fillRect(100,450,100,50);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==b1)
		{
		a=true;
		repaint();
		}
	
		if(e.getSource()==b2)
		{
			b=true;
		repaint();
		}
		
		if(e.getSource()==b3)
		{
			c=true;
		repaint();
		}
		
	}
	
	}

	class Demo
	{
		public static void main(String ar[])
		{
		Shape n = new Shape();
        n.setVisible(true);
        n.setSize(600,400);	
        n.setLocation(200,100);	
       
		}
	}
	
	
	
	
	