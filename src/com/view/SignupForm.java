package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mode.User;
import com.service.UserService;
import com.service.UserServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtfirstname;
	private JLabel lblNewLabel_2;
	private JTextField txtlastname;
	private JLabel lblNewLabel_3;
	private JTextField txtusername;
	private JLabel lblNewLabel_4;
	private JPasswordField txtpsw;
	private JLabel lblNewLabel_5;
	private JPasswordField txtrpsw;
	private JLabel lblNewLabel_7;
	private JTextField txtaddress;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupForm frame = new SignupForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignupForm() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setForeground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\Downloads\\302008777_171168755475840_4651879456345235236_n.jpg"));
		setTitle("register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(49, 66, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTxtfirstname());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTxtlastname());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTxtusername());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTxtpsw());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTxtrpsw());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getTxtaddress());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_8());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Signup Here");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblNewLabel.setBackground(new Color(255, 128, 0));
			lblNewLabel.setBounds(278, 0, 214, 56);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Firstname");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(190, 61, 81, 23);
		}
		return lblNewLabel_1;
	}
	private JTextField getTxtfirstname() {
		if (txtfirstname == null) {
			txtfirstname = new JTextField();
			txtfirstname.setBounds(268, 58, 203, 33);
			txtfirstname.setColumns(10);
		}
		return txtfirstname;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Lastname");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2.setBounds(190, 112, 81, 23);
		}
		return lblNewLabel_2;
	}
	private JTextField getTxtlastname() {
		if (txtlastname == null) {
			txtlastname = new JTextField();
			txtlastname.setBounds(268, 109, 203, 33);
			txtlastname.setColumns(10);
		}
		return txtlastname;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Username");
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_3.setBounds(190, 163, 71, 23);
		}
		return lblNewLabel_3;
	}
	private JTextField getTxtusername() {
		if (txtusername == null) {
			txtusername = new JTextField();
			txtusername.setBounds(268, 160, 203, 33);
			txtusername.setColumns(10);
		}
		return txtusername;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Password");
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4.setBounds(190, 221, 71, 23);
		}
		return lblNewLabel_4;
	}
	private JPasswordField getTxtpsw() {
		if (txtpsw == null) {
			txtpsw = new JPasswordField();
			txtpsw.setBounds(268, 218, 203, 33);
		}
		return txtpsw;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Repassword");
			lblNewLabel_5.setForeground(new Color(255, 255, 255));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_5.setBounds(172, 280, 89, 23);
		}
		return lblNewLabel_5;
	}
	private JPasswordField getTxtrpsw() {
		if (txtrpsw == null) {
			txtrpsw = new JPasswordField();
			txtrpsw.setBounds(268, 274, 208, 38);
		}
		return txtrpsw;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Address");
			lblNewLabel_7.setForeground(new Color(255, 255, 255));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7.setBounds(190, 376, 77, 11);
		}
		return lblNewLabel_7;
	}
	private JTextField getTxtaddress() {
		if (txtaddress == null) {
			txtaddress = new JTextField();
			txtaddress.setBounds(268, 367, 224, 33);
			txtaddress.setColumns(10);
		}
		return txtaddress;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new WelcomeForm().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBounds(240, 433, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Register");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(txtusername.getText().isBlank()) {
						JOptionPane.showMessageDialog(txtusername, "name is required");
						return;
						
					}
					if(txtpsw.getText().isBlank()) {
						JOptionPane.showMessageDialog(txtpsw, "name is required");
						return;
						
					}
					String Firstname=txtfirstname.getText();
					String Lastname=txtlastname.getText();
					String Username = txtusername.getText();
					String Password = txtpsw.getText();
					String Repassword=txtrpsw.getText();
					String Address=txtaddress.getText();
					
					User u = new User();
					u.setFirstname(Firstname);
					u.setLastname(Lastname);
					u.setUsername(Username);
					u.setPassword(Password);
					u.setRepassword(Repassword);
					u.setAddress(Address);
					
					UserService us = new UserServiceImpl();
					if(us.Signup(u)){
						JOptionPane.showMessageDialog(null, "register success");
						new LoginForm().setVisible(true);
					
					}else {
						JOptionPane.showMessageDialog(null, "register failed");
					}
					
					
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setBackground(new Color(0, 128, 255));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_1.setBounds(366, 435, 99, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("click here to login");
			lblNewLabel_8.setForeground(new Color(255, 255, 255));
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_8.setBounds(308, 467, 157, 34);
		}
		return lblNewLabel_8;
	}
}
