package project.restourant.view.MainView.Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class CentralLeftPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public CentralLeftPanel() {
		// Setting basic parameters for this panel
		TitledBorder border = new TitledBorder(null, " TABLE LAYOUT ", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLACK);
		border.setTitleFont(new Font("Tahoma", Font.ITALIC, 20));
		setBorder(border);

		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		createTables();
		createChairs();
	}

	// This method creates tables buttons. When one of the tables is clicked frame
	// with food menu, drinks menu and dessert menu is open.
	private void createTables() {
		JButton table6Btn = new JButton("6");
		table6Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table6Btn.setBorderPainted(false);
		table6Btn.setBackground(Color.GREEN);
		table6Btn.setBounds(35, 311, 80, 80);
		add(table6Btn);

		JButton table5Btn = new JButton("5");
		table5Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table5Btn.setBorderPainted(false);
		table5Btn.setBackground(Color.GREEN);
		table5Btn.setBounds(35, 91, 80, 80);
		add(table5Btn);

		JButton table4Btn = new JButton("4");
		table4Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table4Btn.setBorderPainted(false);
		table4Btn.setBackground(Color.GREEN);
		table4Btn.setBounds(310, 91, 120, 120);
		add(table4Btn);

		JButton table3Btn = new JButton("3");
		table3Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table3Btn.setBorderPainted(false);
		table3Btn.setBackground(Color.GREEN);
		table3Btn.setBounds(570, 91, 240, 120);
		add(table3Btn);

		JButton table2Btn = new JButton("2");
		table2Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table2Btn.setBorderPainted(false);
		table2Btn.setBackground(Color.GREEN);
		table2Btn.setBounds(630, 457, 120, 120);
		add(table2Btn);

		JButton table1Btn = new JButton("1");
		table1Btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table1Btn.setBorderPainted(false);
		table1Btn.setBackground(Color.GREEN);
		table1Btn.setBounds(380, 457, 120, 120);
		add(table1Btn);
	}

	// This method is used for look an feel of the application. It creates chairs
	// for every table. Chairs don't have any function.
	private void createChairs() {
		JPanel c11 = new JPanel();
		c11.setBackground(Color.GREEN);
		c11.setBounds(320, 462, 50, 50);
		add(c11);

		JPanel c12 = new JPanel();
		c12.setBackground(Color.GREEN);
		c12.setBounds(320, 522, 50, 50);
		add(c12);

		JPanel c13 = new JPanel();
		c13.setBackground(Color.GREEN);
		c13.setBounds(415, 397, 50, 50);
		add(c13);

		JPanel c14 = new JPanel();
		c14.setBackground(Color.GREEN);
		c14.setBounds(510, 462, 50, 50);
		add(c14);

		JPanel c15 = new JPanel();
		c15.setBackground(Color.GREEN);
		c15.setBounds(510, 522, 50, 50);
		add(c15);

		JPanel c21 = new JPanel();
		c21.setBackground(Color.GREEN);
		c21.setBounds(570, 522, 50, 50);
		add(c21);

		JPanel c22 = new JPanel();
		c22.setBackground(Color.GREEN);
		c22.setBounds(570, 462, 50, 50);
		add(c22);

		JPanel c23 = new JPanel();
		c23.setBackground(Color.GREEN);
		c23.setBounds(665, 397, 50, 50);
		add(c23);

		JPanel c24 = new JPanel();
		c24.setBackground(Color.GREEN);
		c24.setBounds(760, 462, 50, 50);
		add(c24);

		JPanel c25 = new JPanel();
		c25.setBackground(Color.GREEN);
		c25.setBounds(760, 522, 50, 50);
		add(c25);

		JPanel c31panel = new JPanel();
		c31panel.setBounds(510, 126, 50, 50);
		c31panel.setBackground(Color.GREEN);
		add(c31panel);

		JPanel c32 = new JPanel();
		c32.setBackground(Color.GREEN);
		c32.setBounds(575, 221, 50, 50);
		add(c32);

		JPanel c33 = new JPanel();
		c33.setBackground(Color.GREEN);
		c33.setBounds(665, 221, 50, 50);
		add(c33);

		JPanel c34 = new JPanel();
		c34.setBackground(Color.GREEN);
		c34.setBounds(755, 221, 50, 50);
		add(c34);

		JPanel c35 = new JPanel();
		c35.setBackground(Color.GREEN);
		c35.setBounds(820, 126, 50, 50);
		add(c35);

		JPanel c36 = new JPanel();
		c36.setBackground(Color.GREEN);
		c36.setBounds(755, 31, 50, 50);
		add(c36);

		JPanel c37 = new JPanel();
		c37.setBackground(Color.GREEN);
		c37.setBounds(665, 31, 50, 50);
		add(c37);

		JPanel c38 = new JPanel();
		c38.setBackground(Color.GREEN);
		c38.setBounds(575, 31, 50, 50);
		add(c38);

		JPanel c41 = new JPanel();
		c41.setBackground(Color.GREEN);
		c41.setBounds(315, 31, 50, 50);
		add(c41);

		JPanel c42 = new JPanel();
		c42.setBackground(Color.GREEN);
		c42.setBounds(375, 31, 50, 50);
		add(c42);

		JPanel c43 = new JPanel();
		c43.setBackground(Color.GREEN);
		c43.setBounds(375, 221, 50, 50);
		add(c43);

		JPanel c44 = new JPanel();
		c44.setBackground(Color.GREEN);
		c44.setBounds(315, 221, 50, 50);
		add(c44);

		JPanel c45 = new JPanel();
		c45.setBackground(Color.GREEN);
		c45.setBounds(250, 126, 50, 50);
		add(c45);

		JPanel c51 = new JPanel();
		c51.setBackground(Color.GREEN);
		c51.setBounds(50, 181, 50, 50);
		add(c51);

		JPanel c52 = new JPanel();
		c52.setBackground(Color.GREEN);
		c52.setBounds(50, 30, 50, 50);
		add(c52);

		JPanel c61 = new JPanel();
		c61.setBackground(Color.GREEN);
		c61.setBounds(50, 401, 50, 50);
		add(c61);

		JPanel c62 = new JPanel();
		c62.setBackground(Color.GREEN);
		c62.setBounds(50, 251, 50, 50);
		add(c62);
	}

}
