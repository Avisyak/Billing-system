package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mode.User;
import com.service.UserService;
import com.service.UserServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel txtus;
	private JLabel lblNewLabel_1;
	private JTextField txtusername;
	private JPasswordField txtpsw;
	private JButton btncancel;
	private JButton btnlogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 568);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(41, 79, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtus());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTxtusername());
		contentPane.add(getTxtpsw());
		contentPane.add(getBtncancel());
		contentPane.add(getBtnlogin());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_2());
	}

	private JLabel getTxtus() {
		if (txtus == null) {
			txtus = new JLabel("Username");
			txtus.setFont(new Font("Times New Roman", Font.BOLD, 14));
			txtus.setBounds(177, 116, 76, 27);
		}
		return txtus;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblNewLabel_1.setBounds(177, 174, 76, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTxtusername() {
		if (txtusername == null) {
			txtusername = new JTextField();
			txtusername.setBounds(263, 111, 264, 39);
			txtusername.setColumns(10);
		}
		return txtusername;
	}
	private JPasswordField getTxtpsw() {
		if (txtpsw == null) {
			txtpsw = new JPasswordField();
			txtpsw.setBounds(273, 169, 259, 39);
		}
		return txtpsw;
	}
	private JButton getBtncancel() {
		if (btncancel == null) {
			btncancel = new JButton("Cancel");
			btncancel.setForeground(new Color(255, 255, 255));
			btncancel.setBackground(new Color(255, 0, 0));
			btncancel.setFont(new Font("Tahoma", Font.BOLD, 14));
			btncancel.setBounds(280, 267, 89, 23);
		}
		return btncancel;
	}
	private JButton getBtnlogin() {
		if (btnlogin == null) {
			btnlogin = new JButton("Login");
			btnlogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(txtusername.getText().isBlank()) {
						JOptionPane.showMessageDialog(txtusername, "username is required");
						return;
						
					}
					if(txtpsw.getText().isBlank()) {
						JOptionPane.showMessageDialog(txtpsw, "password is required");
						return;
						
					}
					String Username = txtusername.getText();
					String password = txtpsw.getText();
					
					
					
					User u = new User();
					
					u.setUsername(Username);
					u.setPassword(password);
					
					UserService us = new UserServiceImpl();
					if( us.Login(u)) {
					
						new QuickBillHomeform().setVisible(true);
					}else {
						
						
					}
				}
			});
			btnlogin.setForeground(new Color(255, 255, 255));
			btnlogin.setBackground(new Color(0, 128, 255));
			btnlogin.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnlogin.setBounds(428, 267, 89, 23);
		}
		return btnlogin;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Click here to create a new Account");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new SignupForm().setVisible(true);
					dispose();
				}
			});
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(291, 318, 230, 27);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Login Here");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_2.setBounds(308, 11, 209, 58);
		}
		return lblNewLabel_2;
	}
}
