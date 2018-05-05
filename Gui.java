

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

	// all visual objects for actual program
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnUsdToCad;
	private JButton btnCadToUsd;
	private JButton btnMilesToKilometers;
	private JButton btnKilometersToMiles;
	private JButton btnMetersToMiles;
	private JButton btnMilesToMeters;
	private JButton btnDaysToSeconds;
	private JButton btnSecondsToDays;
	private JButton btnGramsToPounds;
	private JButton btnPoundsToGrams;
	private JButton btnCadToPounds;
	private JButton btnPoundsToCad;

	/**
	 * all objects being used, instantiated, and added to the frame(layout)
	 * 
	 **/
	public Gui() {
		super("Calverter");
		setLayout(new FlowLayout());

		btnAdd = new JButton("add");
		btnSub = new JButton("subtract");
		btnMult = new JButton("multiply");
		btnDiv = new JButton("divide");
		btnUsdToCad = new JButton("usd to cad");
		btnCadToUsd = new JButton("cad to usd");
		btnMilesToKilometers = new JButton("mi to km");
		btnKilometersToMiles = new JButton("kilometers to miles");
		btnSecondsToDays = new JButton("seconds to days");
		btnDaysToSeconds = new JButton("days to seconds");
		btnGramsToPounds = new JButton("grams to pounds");
		btnPoundsToGrams = new JButton("pounds to grams");
		btnCadToPounds = new JButton("cad to pounds");
		btnPoundsToCad = new JButton("pounds to cad");
		btnMilesToMeters = new JButton("miles to meters");
		btnMetersToMiles = new JButton("meters to miles");

		add(btnAdd);
		add(btnSub);
		add(btnDiv);
		add(btnMult);
		add(btnUsdToCad);
		add(btnCadToUsd);
		add(btnMilesToKilometers);
		add(btnKilometersToMiles);
		add(btnMetersToMiles);
		add(btnMilesToMeters);
		add(btnDaysToSeconds);
		add(btnSecondsToDays);
		add(btnGramsToPounds);
		add(btnPoundsToGrams);
		add(btnCadToPounds);
		add(btnPoundsToCad);

		HandlerClass handler = new HandlerClass();

		btnAdd.addActionListener(handler);
		btnSub.addActionListener(handler);
		btnMult.addActionListener(handler);
		btnDiv.addActionListener(handler);
		btnUsdToCad.addActionListener(handler);
		btnCadToUsd.addActionListener(handler);
		btnMilesToKilometers.addActionListener(handler);
		btnKilometersToMiles.addActionListener(handler);
		btnMetersToMiles.addActionListener(handler);
		btnMilesToMeters.addActionListener(handler);
		btnDaysToSeconds.addActionListener(handler);
		btnSecondsToDays.addActionListener(handler);
		btnPoundsToGrams.addActionListener(handler);
		btnGramsToPounds.addActionListener(handler);
		btnCadToPounds.addActionListener(handler);
		btnPoundsToCad.addActionListener(handler);

	}

	// inner class that handles when buttons for the program are press
	private static class HandlerClass extends JFrame implements ActionListener {

		// i only use two inputs and one btn
		private JTextField input1;
		private JTextField input2;
		private JButton btn;

		// set layout for when a function you want to do
		public HandlerClass() {
			super("Converter/Calculator");
			setLayout(new FlowLayout());

			// get input from user, two posible value
			input1 = new JTextField(10);
			input2 = new JTextField(10);

			btn = new JButton("calculate");
			btn.addActionListener(this);
		}

		// when a button is pressed, this method is called
		@Override
		public void actionPerformed(ActionEvent e) {

			// create a new layout for the user to enter values, depending on what function
			// they want to do
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(300, 100);
			setVisible(true);

			add(input1);
			add(input2);
			add(btn);

			if (e.getActionCommand() == "add") { // sets title, so i know what operation is being performed
				this.setTitle("add");
				input2.setVisible(true);

			} else if (e.getActionCommand() == "subtract") {
				this.setTitle("subtract");
				input2.setVisible(true);

			} else if (e.getActionCommand() == "divide") {
				this.setTitle("divide");
				input2.setVisible(true);

			} else if (e.getActionCommand() == "multiply") {
				this.setTitle("multiply");
				input2.setVisible(true);

			} else if (e.getActionCommand() == "usd to cad") {

				this.setTitle("usd to cad");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "cad to usd") {

				this.setTitle("cad to usd");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "cad to pounds") {
				this.setTitle("cad to pounds");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "pounds to cad") {
				this.setTitle("pounds to cad");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "mi to km") {
				this.setTitle("mi to km");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "kilometers to miles") {
				this.setTitle("kilometers to miles");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "meters to miles") {

				this.setTitle("meters to miles");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "miles to meters") {

				this.setTitle("miles to meters");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "days to seconds") {

				this.setTitle("days to seconds");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "seconds to days") {

				this.setTitle("seconds to days");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "grams to ounces") {

				this.setTitle("grams to ounces");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "ounces to grams") {

				this.setTitle("ounces to grams");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "grams to pounds") {

				this.setTitle("grams to pounds");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "pounds to grams") {

				this.setTitle("pounds to grams");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "cad to pounds") {
				this.setTitle("cad to pounds");
				input2.setVisible(false);
			} else if (e.getActionCommand() == "pounds to cad") {
				this.setTitle("pounds to cad");

			} else if (e.getActionCommand() == "calculate") { // after youve picked your function, and click calculate,
																// it checks to see what the title is, to see which
																// operation is being performed

				if (this.getTitle() == "add") {
					int a = Integer.parseInt(input1.getText());
					int b = Integer.parseInt(input2.getText());
					JOptionPane.showMessageDialog(null, Methods.add(a, b));
				} else if (this.getTitle() == "subtract") {
					int a = Integer.parseInt(input1.getText());
					int b = Integer.parseInt(input2.getText());
					JOptionPane.showMessageDialog(null, Methods.subtract(a, b));
				} else if (this.getTitle() == "multiply") {
					int a = Integer.parseInt(input1.getText());
					int b = Integer.parseInt(input2.getText());
					JOptionPane.showMessageDialog(null, Methods.multiply(a, b));
				} else if (this.getTitle() == "divide") {
					int a = Integer.parseInt(input1.getText());
					int b = Integer.parseInt(input2.getText());
					JOptionPane.showMessageDialog(null, Methods.divide(a, b));
				} else if (this.getTitle() == "cad to usd") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.cadToUsd(a));
				} else if (this.getTitle() == "usd to cad") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.usdToCad(a));
				} else if (this.getTitle() == "miles to kilometers") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.milesToKilometers(a));
				} else if (this.getTitle() == "kilometers to miles") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.kilometersToMiles(a));
				} else if (this.getTitle() == "meters to miles") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.metersToMiles(a));
				} else if (this.getTitle() == "miles to meters") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.milesToMeters(a));
				} else if (this.getTitle() == "days to second") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.daysToSeconds(a));
				} else if (this.getTitle() == "seconds to days") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.secondsToDays(a));
				} else if (this.getTitle() == "grams to ounces") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.gramsToOunces(a));
				} else if (this.getTitle() == "ounces to grams") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.ouncesToGrams(a));
				} else if (this.getTitle() == "grams to pounds") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.gramsToPounds(a));
				} else if (this.getTitle() == "pounds to grams") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.poundsToGrams(a));
				} else if (this.getTitle() == "cad to pounds") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.cadToPounds(a));
				} else if (this.getTitle() == "pounds to cad") {
					int a = Integer.parseInt(input1.getText());
					JOptionPane.showMessageDialog(null, Methods.poundsToCad(a));
				}
			}
		}// end of action performed

	}// end of handler class

}
