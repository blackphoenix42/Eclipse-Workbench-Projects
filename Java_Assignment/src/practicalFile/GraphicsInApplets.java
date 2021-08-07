package practicalFile;

/* Applet code=DrawLineRect width = 600 height = 40></Applet>*/
import java.awt.*;
import java.applet.*;

public class GraphicsInApplets extends Applet {
	public void paint(Graphics g) {
		g.drawRect(10, 60, 40, 30);
		g.fillRect(60, 10, 30, 80);
		g.fillOval(140, 160, 170, 170);
		g.drawRoundRect(10, 100, 80, 50, 10, 10);
		g.fillRoundRect(20, 110, 60, 30, 5, 5);
		g.drawArc(280, 210, 250, 220, 30, 90);
		g.drawLine(100, 10, 230, 140);
		g.drawLine(100, 140, 230, 10);
	}
}