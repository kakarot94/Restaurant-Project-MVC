package project.restourant.view.MainView.Components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CentralRightPanel extends JPanel {
	
	private JLabel lblMenuChoise;
	private JButton drinksBtn;
	private JButton foodBtn;
	private JButton dessertBtn;
	private JButton availableStockBtn;
	private JButton orderBtn;
	private JButton billsBtn;
	private JButton chargeBillBtn;
	private JButton checkBillBtn;
	
	public CentralRightPanel() {
		super();
		// Setting basic parameters for this panel.
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));
		Color color = new Color(0, 255, 255);

		// Setting components for this panel.
		lblMenuChoise = new JLabel("MENU CHOISE");
		lblMenuChoise.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenuChoise.setBounds(30, 10, 150, 30);
		add(lblMenuChoise);

		drinksBtn = new JButton("DRINKS MENU"); // -----Opens DrinksMenuFrame-----
		drinksBtn.setBackground(color);
		drinksBtn.setBorderPainted(false);
		drinksBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		drinksBtn.setBounds(90, 55, 210, 35);
		add(drinksBtn);

		foodBtn = new JButton("FOOD MENU"); // -----Opens FoodMenuFrame-----
		foodBtn.setBackground(color);
		foodBtn.setBorderPainted(false);
		foodBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		foodBtn.setBounds(90, 115, 210, 35);
		add(foodBtn);

		dessertBtn = new JButton("DESSERT MENU"); // -----Opens DessertManuFrame-----
		dessertBtn.setBackground(color);
		dessertBtn.setBorderPainted(false);
		dessertBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dessertBtn.setBounds(90, 175, 210, 35);
		add(dessertBtn);

		availableStockBtn = new JButton("AVAILABLE STOCK"); // -----Opens query with available stock-----
		availableStockBtn.setBackground(color);
		availableStockBtn.setBorderPainted(false);
		availableStockBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		availableStockBtn.setBounds(30, 245, 210, 35);
		add(availableStockBtn);

		orderBtn = new JButton("NEW ORDER"); // -----Opens NewOrderFrame-----
		orderBtn.setBackground(color);
		orderBtn.setBorderPainted(false);
		orderBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		orderBtn.setBounds(30, 305, 210, 35);
		add(orderBtn);

		billsBtn = new JButton("ALL BILLS"); // -----Opens query with all bills-----
		billsBtn.setBackground(color);
		billsBtn.setBorderPainted(false);
		billsBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		billsBtn.setBounds(30, 365, 210, 35);
		add(billsBtn);

		chargeBillBtn = new JButton("CHARGE THE BILL"); // -----Opens ChargeTheBillFrame-----
		chargeBillBtn.setBackground(color);
		chargeBillBtn.setBorderPainted(false);
		chargeBillBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chargeBillBtn.setBounds(210, 500, 170, 30);
		add(chargeBillBtn);

		checkBillBtn = new JButton("CHECK THE BILL"); // -----Opens CheckTheBillFrame-----
		checkBillBtn.setBackground(color);
		checkBillBtn.setBorderPainted(false);
		checkBillBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBillBtn.setBounds(20, 500, 170, 30);
		add(checkBillBtn);

	}
}
