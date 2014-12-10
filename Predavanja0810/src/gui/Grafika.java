package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Grafika extends JPanel {
	
	public void paint(Graphics g) {
		g.drawString("Neki tekst", 100, 100);
		g.drawLine(200, 100, 300, 150);
		g.drawOval(200,  200, 300, 300);
	}

}
