package project.restourant.view.MainView.Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

// This is footer panel for main frame.
public class MainFooterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel copyRightLabel;
	private JLabel firmNameLabel;

	public MainFooterPanel() {
		setBackground(new Color(0, 0, 0, 0));

		// Setting basic parameters for this panel
		copyRightLabel = new JLabel("© 2018");
		copyRightLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		firmNameLabel = new JLabel("Kakarot IT Corporation");
		firmNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 40, 10, 0);
		add(copyRightLabel, gc);

		gc.gridx = 3;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 10, 40);
		add(firmNameLabel, gc);
	}
}
