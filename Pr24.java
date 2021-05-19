import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code="Pr24" width=300 height=100></applet>

public class Pr24 extends Applet implements KeyListener
{
	String S = "";
	
	public void init()
	{
		addKeyListener(this);
	}
	
	public void keyPressed (KeyEvent E)
	{
		showStatus("Key Pressed");
		int n = E.getKeyCode();
		
		switch(n)
		{
			case KeyEvent.VK_UP:
			S += "<UP>"; break;
			
			case KeyEvent.VK_DOWN:
			S += "<DOWN>"; break;
			
			case KeyEvent.VK_LEFT:
			S += "<LEFT>"; break;
			
			case KeyEvent.VK_RIGHT:
			S += "<RIGHT>"; break;
		}
		repaint();
	}
	
	public void keyReleased (KeyEvent E)
	{
		showStatus("Key Released");
	}
	
	public void keyTyped (KeyEvent E)
	{
		S += E.getKeyChar();
		repaint();
	}
	
	public void paint (Graphics G)
	{
		G.drawString (S, 10, 20);
	}
}

