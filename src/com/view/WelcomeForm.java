package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnadmin;
	private JButton btncashier;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeForm frame = new WelcomeForm();
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
	public WelcomeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 181, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnadmin());
		contentPane.add(getBtncashier());
		contentPane.add(getLblNewLabel_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Weclome To SuperMarket Billing System");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblNewLabel.setBounds(128, 11, 569, 35);
		}
		return lblNewLabel;
	}
	private JButton getBtnadmin() {
		if (btnadmin == null) {
			btnadmin = new JButton("Admin Login");
			btnadmin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginForm().setVisible(true);
					dispose();
					
				}
			});
			btnadmin.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnadmin.setBounds(497, 153, 165, 35);
		}
		return btnadmin;
	}
	private JButton getBtncashier() {
		if (btncashier == null) {
			btncashier = new JButton("Cashier Login");
			btncashier.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CashierDetailsForm().setVisible(true);
					dispose();
				}
			});
			btncashier.setFont(new Font("Tahoma", Font.BOLD, 14));
			btncashier.setBounds(497, 251, 165, 35);
		}
		return btncashier;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\302008777_171168755475840_4651879456345235236_n.jpg"));
			lblNewLabel_1.setBounds(35, 85, 323, 263);
		}
		return lblNewLabel_1;
	}
}
