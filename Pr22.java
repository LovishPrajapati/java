import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

// <applet code="Pr22" width=500 height=200></applet>

public class Pr22 extends Applet
{
	String S1 = "", S2 = "";
	
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		
		addMouseListener (new MouseAdapter() 
						{
							public void mouseEntered (MouseEvent E)
							{
								showStatus("Mouse Entered");
								URL url1 = getCodeBase();
								URL url2 = getDocumentBase();
								S1 = "Code Base:  " + url1.toString();
								S2 = "Document Base:  " + url2.toString();
								repaint();
							}
								
							public void mouseExited (MouseEvent E)
							{
								showStatus("Mouse Exited");
								S1 = ""; S2 = "";
								repaint();
							}
						});
											
	}
	
	public void paint (Graphics G)
	{
		G.drawString(S1, 10, 20);
		G.drawString(S2, 10, 40);
	}
}
