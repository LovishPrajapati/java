import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = "Pr21" width = 300 height = 100></applet>

class Child extends Frame
{
	String S = "";

	Child(String Name)
	{
		super(Name);
		addMouseListener (new MouseAdapter()
						{
							public void mouseEntered (MouseEvent E)
							{
								S = "Mouse Entered";
								repaint();
							}
							public void mouseExited (MouseEvent E)
							{
								S = "Mouse Exited";
								repaint();
							}
						});
						
		addWindowListener (new WindowAdapter()
						{
							public void windowClosing (WindowEvent E)
							{
								setVisible(false);
							}
						});
	}

	public void paint (Graphics G)
	{
		G.drawString ("This is Child Window", 10, 40);
		G.drawString (S, 10, 80);
	}
}

public class Pr21 extends Applet
{
	Frame F;
	String S = "";
	
	public void init()
	{
		addMouseListener (new MouseAdapter()
						{
							public void mouseEntered (MouseEvent E)
							{
								S = "Mouse Entered";
								F = new Child("Child Window");
								F.setSize(300, 100);
								F.setVisible(true);
								repaint();
							}
							
							public void mouseExited (MouseEvent E)
							{
								S = "Mouse Exited";
								F.setVisible(false);
								repaint();
							}
						});
	}
	

	
	public void paint (Graphics G)
	{
		G.drawString ("This is Applet Windows", 10, 30);
		G.drawString (S, 10, 60);
	}
}	
