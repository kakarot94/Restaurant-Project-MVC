package project.restourant.view.MainView.Components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

/*
 * CentralPanel is composed from CentralLeftPanel and CentralRightPanel.
 */
public class CentralPanel extends JPanel {

	private CentralLeftPanel centralLeftPanel;
	private CentralRightPanel centralRightPanel;

	public CentralPanel() {
		super();
		setBackground(new Color(0, 0, 0, 0));
		setLayout(new BorderLayout());

		centralLeftPanel = new CentralLeftPanel();
		centralLeftPanel.setPreferredSize(new Dimension(900, 600));
		centralRightPanel = new CentralRightPanel();
		centralRightPanel.setPreferredSize(new Dimension(400, 600));

		add(centralLeftPanel, BorderLayout.WEST);
		add(centralRightPanel, BorderLayout.EAST);
	}

}
