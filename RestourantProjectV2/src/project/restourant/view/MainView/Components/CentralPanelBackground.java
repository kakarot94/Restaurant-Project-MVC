package project.restourant.view.MainView.Components;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// This JPanel is used to set blur on the background of central panel
public class CentralPanelBackground extends JPanel {

	public CentralPanelBackground(Dimension dimension) {

		JLabel labelBack = new JLabel();
		labelBack.setBackground(new Color(0, 0, 0, 0));
		labelBack.setIcon(new ImageIcon(CentralPanelBackground.class.getResource("/images/white.jpeg")));
		labelBack.setSize(dimension);
		add(labelBack);
	}

	// Method paint is used to set opacity of the label(background).
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 0.2));
		super.paint(g2);
		g2.dispose();
	}

}
