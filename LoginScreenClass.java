

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.ArrayList;

public class LoginScreenClass extends JFrame implements ActionListener {
	// all variables i use in the login screen
	private JTextField username;
	private JPasswordField password;
	private JButton btnLogin;
	private JLabel title;
	private Font titleFont;
	private JTextField createUser;
	private JPasswordField createdPass;
	private JPasswordField createdPass2;
	private Font subTitleFont;
	private JButton btnCreate;
	private static ArrayList<String> usernames;
	private static ArrayList<String> passwords;

	// initialize objects im using, buttons.. etc
	LoginScreenClass() {
		super("Calverter");
		setLayout(new GridLayout(20, 15));

		username = new JTextField();
		password = new JPasswordField("");
		btnLogin = new JButton("login");
		title = new JLabel("Welcome to the Calverter");
		titleFont = new Font("Serif", Font.BOLD, 23);
		createUser = new JTextField();
		createdPass = new JPasswordField("");
		createdPass2 = new JPasswordField("");
		subTitleFont = new Font("Serif", Font.BOLD, 17);
		btnCreate = new JButton("Create Account!");
		usernames = new ArrayList<String>();
		passwords = new ArrayList<String>();

		title.setFont(titleFont);
		title.setForeground(Color.DARK_GRAY);

		this.add(title);
		this.add(new JLabel());
		this.add(new JLabel("Login")).setFont(subTitleFont);
		this.add(new JLabel("username"));
		this.add(username);
		this.add(new JLabel("password"));
		this.add(password);
		this.add(new JLabel());
		this.add(btnLogin);

		this.add(new JLabel());
		this.add(new JLabel("Create Account")).setFont(subTitleFont);
		this.add(new JLabel("Create username"));
		this.add(createUser);
		this.add(new JLabel("Create password"));
		this.add(createdPass);
		this.add(new JLabel("Repeat password"));
		this.add(createdPass2);
		this.add(new JLabel());
		this.add(btnCreate);

		btnLogin.addActionListener(this);
		btnCreate.addActionListener(this);
	}

	// check created account, if username exists, make a new one..., passwords need
	// to match
	// also cant be empty
	public void checkCreated(String username, String p1, String p2) {

		if (username.isEmpty() || p1.isEmpty() || p2.isEmpty())
			JOptionPane.showMessageDialog(null, "Check what you entered.");
		else if (usernames.contains(username))
			JOptionPane.showMessageDialog(null, "Username exists.");
		else if (!p1.equals(p2))
			JOptionPane.showMessageDialog(null, "Passwords dont match.");
		else {
			usernames.add(username);
			passwords.add(p1);
			JOptionPane.showMessageDialog(null, "Login with the the account you just created.");
		}
	}

	// if username exists, and its in the same index in both lists, meaning account
	// exists, then you can login, because multiple passwords can exist for
	// different usernames
	private void checkLogin(String username, String password) {
		if (usernames.contains(username) && passwords.contains(password)) {
			if (passwords.get(usernames.indexOf(username)).equals(password))
				linkToApp();
		} else
			JOptionPane.showMessageDialog(null,
					"Invalid username/password, make sure to create an account before you login>");
	}

	// if youve succesfully created an account, and login with that information, you
	// get access to the program
	private void linkToApp() {
		Gui g = new Gui();
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setSize(150, 600);
		g.setVisible(true);
	}

	// gets information from what user typed, and goes to either checkCreated(), or
	// checkLogin()
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Create Account!")
			checkCreated(createUser.getText(), new String(createdPass.getPassword()),
					new String(createdPass2.getPassword()));
		else if (e.getActionCommand() == "login")
			checkLogin(username.getText(), new String(password.getPassword()));
	}

}
