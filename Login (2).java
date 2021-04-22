import java.awt.*;
import javax.swing.*;                  //LOGIN PAGE
import java.awt.event.*;
import java.awt.*;
class Login extends Frame implements KeyListener
{
	JTextField tx1;
	JPasswordField tx2;
	JButton b1;
	Login()
	{
		
		setTitle("WELCOME TO LOGIN PAGE");
		Font f = new Font("FOLD",Font.BOLD,30);
	
		setLayout(new FlowLayout());
		
		/*JLabel u = new JLabel("Welcome by Surbhi Bhawsar");
		u.setSize(550,60);
		u.setLocation(100,50);
		u.setFont(f);
		add(u);*/
		
		JLabel u1 = new JLabel("Enter name");
		u1.setSize(200,40);
		u1.setLocation(250,250);
		u1.setFont(f);
		add(u1);
		
		 tx1 = new JTextField("Enter name",10);
		tx1.setSize(200,50);
		tx1.setLocation(500,250);
		add(tx1);
		tx1.setFont(f);
		tx1.addKeyListener(this);
		tx1.setForeground(Color.gray);
		
	    JLabel u2 = new JLabel("Enter Password");
		u2.setSize(240,60);
		u2.setLocation(250,350);
		add(u2);
		u2.setFont(f);
		
	    tx2 = new JPasswordField("Enter password",10);
		tx2.setSize(200,50);
		tx2.setLocation(500,350);
		tx2.setFont(f);
		tx2.setEchoChar((char)0);
		add(tx2);
		
		tx2.addKeyListener(this);
        tx2.setForeground(Color.gray);		
		
		
	    b1 = new JButton("Login");
		b1.setSize(100,60);
		b1.setLocation(450,450);
		add(b1);
		b1.setFont(f);
		
		      setResizable(false);
	}
	public void keyReleased(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
		String s1= tx1.getText().trim();//remove space
		if(s1.equals(""))
		 {
			tx1.setText("Enter name");
		tx1.setForeground(Color.gray);
		 }
	    }
		if(tx2.isFocusOwner())
		{
		String s1= tx2.getText().trim();//remove space
		if(s1.equals(""))
		 {
			tx2.setText("Enter password");
		tx2.setForeground(Color.gray);
		tx2.setEchoChar((char)0);
		 }
	    }
		
		}
	public void keyPressed(KeyEvent e)
	{
		if(tx1.isFocusOwner())
		{
		String s1= tx1.getText();
		if(s1.equals("Enter name"))
		 {
			tx1.setText("");
			tx1.setForeground(Color.black);	
		 }
	    }
		if(tx2.isFocusOwner())
		{
		String s1= tx2.getText();
		if(s1.equals("Enter password"))
		 {
			 tx2.setEchoChar('*');
			tx2.setText("");
			tx2.setForeground(Color.black);	
		 }
	    }
	}
	public void keyTyped(KeyEvent e){}
	
	
	
	
} 
class Demo
{
	public static void main(String ar[])
	{
		Login n = new Login();
		n.setVisible(true);
		n.setSize(800,600);
		n.setLocation(200,400);
		
		
		
	}
}