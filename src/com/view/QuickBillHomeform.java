package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuickBillHomeform extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel txtbill;
	private JLabel txtsearch;
	private JLabel txtproduct;
	private JLabel txtsales;
	private JLabel txtexit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuickBillHomeform frame = new QuickBillHomeform();
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
	public QuickBillHomeform() {
		setTitle("Quick Bill");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\Downloads\\302008777_171168755475840_4651879456345235236_n.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1039, 544);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(5, 79, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(230, 247, 136));
			panel.setBounds(0, 0, 1025, 68);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getTxtbill());
			panel.add(getTxtsearch());
			panel.add(getTxtproduct());
			panel.add(getTxtsales());
			panel.add(getTxtexit());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(21, 7, 114, 63);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dell\\OneDrive\\Pictures\\logo-1.png"));
		}
		return lblNewLabel;
	}
	private JLabel getTxtbill() {
		if (txtbill == null) {
			txtbill = new JLabel(" CreateBill");
			txtbill.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Newbill().setVisible(true);
				}
			});
			txtbill.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\bill.png"));
			txtbill.setForeground(new Color(0, 64, 128));
			txtbill.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtbill.setBounds(145, 22, 114, 36);
		}
		return txtbill;
	}
	private JLabel getTxtsearch() {
		if (txtsearch == null) {
			txtsearch = new JLabel(" Search Bill");
			txtsearch.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\search.png"));
			txtsearch.setForeground(new Color(0, 64, 128));
			txtsearch.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtsearch.setBounds(277, 22, 114, 36);
		}
		return txtsearch;
	}
	private JLabel getTxtproduct() {
		if (txtproduct == null) {
			txtproduct = new JLabel("  Product Information");
			txtproduct.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\product.png"));
			txtproduct.setForeground(new Color(0, 64, 128));
			txtproduct.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtproduct.setBounds(401, 22, 196, 36);
		}
		return txtproduct;
	}
	private JLabel getTxtsales() {
		if (txtsales == null) {
			txtsales = new JLabel("  Sales");
			txtsales.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\sales.png"));
			txtsales.setForeground(new Color(0, 64, 128));
			txtsales.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtsales.setBounds(607, 25, 79, 30);
		}
		return txtsales;
	}
	private JLabel getTxtexit() {
		if (txtexit == null) {
			txtexit = new JLabel("Exit");
			txtexit.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\exit.png"));
			txtexit.setForeground(new Color(0, 64, 128));
			txtexit.setFont(new Font("Tahoma", Font.BOLD, 14));
			txtexit.setBounds(941, 22, 58, 36);
		}
		return txtexit;
	}
}
