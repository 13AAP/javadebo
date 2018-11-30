import java.awt.*;
import java.applet.*;
public class AppletParameter extends Applet 
{
	String n;
	String r;
	public void init()
	{
		n = getParameter("name");
		r = getParameter("roll");
	}
	public void paint(Graphics g)
	{
		g.drawString("Name is: " + n, 20, 20);
		g.drawString("Age is: " + r, 20, 40);
	}
}
/*
	<applet code="MyApplet" height="300" width="500">
		<param name="name" value="Ramesh" />
		<param name="roll" value="100" />
	</applet>
*/