package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CrtanjePanel extends JPanel {

	String tekstZaIspis = "pocetak";
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		final CrtanjePanel cp = new CrtanjePanel();
		cp.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				cp.tekstZaIspis = e.getX() + ","+e.getY();
				cp.repaint();
			}
		});
		f.getContentPane().add(cp, BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString(tekstZaIspis, 100, 100);
	}

}
