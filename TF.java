import java.awt.*;
import java.awt.event.*;
class TF extends Frame implements ActionListener
{
	TextField tx1 ;
	TextField tx2;
	Button b1,b2,b3,b4;
	TextField tx3;
	
	TF()
	{
	Font f = new Font("FOLD",Font.BOLD,30);
		setFont(f);
		setBackground(Color.white);
		setLayout(new FlowLayout());
		
        tx1 = new TextField(10);
		add(tx1);
        tx2 = new TextField(10);
        add(tx2);
		
         b1 = new Button("+");
		 //b1.setSize(100,100);
		//b1.setLocation(200,100);
         add(b1);
		  b2 = new Button("-");
		  //b2.setSize(100,100);
		//b2.setLocation(300,100);
         add(b2);
		  b3 = new Button("*");
		  //b3.setSize(100,100);
		//b3.setLocation(400,100);
         add(b3);
		  b4 = new Button("/");
		  //b4.setSize(100,100);
		//b4.setLocation(400,100);
         add(b4);
		 
           tx3 = new TextField(10);
         add(tx3);		 
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{ 
	
	
 if(e.getSource()==b1)
	 {	 
 String s1 = tx1.getText();
    String s2 = tx2.getText();	
	
	int x= Integer.parseInt(s1);	
	int y= Integer.parseInt(s2);
       int z=x+y;
        tx3.setText(" "+z);	
 }	
	if(e.getSource()==b2)
	 {	 
 String s1 = tx1.getText();
    String s2 = tx2.getText();	
	
	int x= Integer.parseInt(s1);	
	int y= Integer.parseInt(s2);
       int z1=x-y;
	tx3.setText(" "+z1);
	 }
	 if(e.getSource()==b3)
	 {	 
 String s1 = tx1.getText();
    String s2 = tx2.getText();	
	
	int x= Integer.parseInt(s1);	
	int y= Integer.parseInt(s2);
       int z2=x*y;
	tx3.setText(" "+z2);
	 }
	 if(e.getSource()==b4)
	 {	 
 String s1 = tx1.getText();
    String s2 = tx2.getText();	
	
	int x= Integer.parseInt(s1);	
	int y= Integer.parseInt(s2);
       int z3=x/y;
	tx3.setText(" "+z3);
	 }
}
	
}
class Demo
	{
		public static void main(String ar[])
		{
		TF n = new TF();
        n.setVisible(true);
        n.setSize(600,400);	
        n.setLocation(200,100);	
       
		}
	}
	
