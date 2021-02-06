import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="key2" width=500 height=500></applet>*/
public class key2 extends Frame implements KeyListener
{
	Label l;
	key2()
	{
		l=new Label();
		l.setBounds(20,50,100,20);
		
		addKeyListener(this);
		add(l);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e)
	{
		l.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent e)
	{
		l.setText("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		l.setText("Key Typed");
	}
	public static void main(String args[])
	{
		new key2();
	}
	
}