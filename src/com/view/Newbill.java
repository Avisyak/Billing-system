package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mode.Bill;
import com.service.BillServiceImpl;
import com.service.billService;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Newbill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField billnotxt;
	private JTextField customernametxt;
	private JComboBox productidbx;
	private JTextField nametxt;
	private JTextField pricetxt;
	private JTextField qtytxt;
	private JTextField discounttxt;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JLabel lblTotal;
	private JTextField totaltxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newbill frame = new Newbill();
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
	public Newbill() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setForeground(new Color(0, 0, 0));
		setTitle("                                                                                    New Bill");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\Downloads\\302008777_171168755475840_4651879456345235236_n.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getBillnotxt());
		contentPane.add(getCustomernametxt());
		contentPane.add(getProductidbx());
		contentPane.add(getNametxt());
		contentPane.add(getPricetxt());
		contentPane.add(getQtytxt());
		contentPane.add(getDiscounttxt());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnRemove());
		contentPane.add(getLblNewLabel_7_1());
		contentPane.add(getTotaltxt());
		DisplayData();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bill No");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(46, 26, 129, 25);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(46, 73, 129, 25);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product Id");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2.setBounds(46, 122, 129, 25);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Name");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_3.setBounds(46, 175, 129, 25);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Price");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_4.setBounds(46, 226, 129, 25);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Quantity");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_5.setBounds(46, 274, 129, 25);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Discount");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_6.setBounds(46, 325, 129, 25);
		}
		return lblNewLabel_6;
	}
	private JTextField getBillnotxt() {
		if (billnotxt == null) {
			billnotxt = new JTextField();
			billnotxt.setBounds(182, 29, 178, 25);
			billnotxt.setColumns(10);
		}
		return billnotxt;
	}
	private JTextField getCustomernametxt() {
		if (customernametxt == null) {
			customernametxt = new JTextField();
			customernametxt.setColumns(10);
			customernametxt.setBounds(185, 76, 175, 25);
		}
		return customernametxt;
	}
	private JComboBox getProductidbx() {
		if (productidbx == null) {
			productidbx = new JComboBox();
			productidbx.setModel(new DefaultComboBoxModel(new String[] {"Select ", "101", "102", "103", "104", "105"}));
			productidbx.setBounds(185, 124, 175, 23);
		}
		return productidbx;
	}
	private JTextField getNametxt() {
		if (nametxt == null) {
			nametxt = new JTextField();
			nametxt.setColumns(10);
			nametxt.setBounds(185, 178, 175, 23);
		}
		return nametxt;
	}
	private JTextField getPricetxt() {
		if (pricetxt == null) {
			pricetxt = new JTextField();
			pricetxt.setColumns(10);
			pricetxt.setBounds(182, 229, 178, 20);
		}
		return pricetxt;
	}
	private JTextField getQtytxt() {
		if (qtytxt == null) {
			qtytxt = new JTextField();
			qtytxt.setColumns(10);
			qtytxt.setBounds(182, 277, 178, 20);
		}
		return qtytxt;
	}
	private JTextField getDiscounttxt() {
		if (discounttxt == null) {
			discounttxt = new JTextField();
			discounttxt.setColumns(10);
			discounttxt.setBounds(182, 328, 178, 20);
		}
		return discounttxt;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(539, 11, 546, 307);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Quantity", "Name", "Discount", "Price"
				}
			));
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				int billno = Integer.parseInt(billnotxt.getText());
				String customername=customernametxt.getText();
				String name = nametxt.getText();
				int id = Integer.parseInt(productidbx.getSelectedItem().toString());
				int price = Integer.parseInt(pricetxt.getText());
				int quantity = Integer.parseInt(qtytxt.getText());
				String Discount = discounttxt.getText();
				
				Bill  b= new Bill();
				b.setBillno(billno);
				b.setId(id);
				b.setCustomername(customername);
				b.setPrice(price);
				b.setName(name);
				b.setQuantity(quantity);
				b.setDiscount(Discount);
				
				billService bs = new BillServiceImpl();
				if(bs.addbill(b)) {
					JOptionPane.showMessageDialog(null, "data added success");
					DisplayData();
				}else {
					JOptionPane.showMessageDialog(null, "data added failed");
				}
				
					
				}
			});
			btnNewButton.setBackground(new Color(128, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\addd1.png"));
			btnNewButton.setBounds(46, 404, 99, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("Remove");
			btnRemove.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\delete.png"));
			btnRemove.setBackground(new Color(255, 0, 0));
			btnRemove.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnRemove.setBounds(196, 404, 129, 23);
		}
		return btnRemove;
	}
	private JLabel getLblNewLabel_7_1() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total");
			lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTotal.setBounds(621, 363, 59, 25);
		}
		return lblTotal;
	}
	private JTextField getTotaltxt() {
		if (totaltxt == null) {
			totaltxt = new JTextField();
			totaltxt.setColumns(10);
			totaltxt.setBounds(702, 364, 178, 25);
		}
		return totaltxt;
	}
	private void DisplayData() {
		billService bs = new BillServiceImpl();
		List<Bill> blist = bs.getAllBill();
		DefaultTableModel tmodel = (DefaultTableModel )table.getModel();
		tmodel.setRowCount(0);
		for(Bill b:blist) {
			tmodel.addRow(new Object[] {b.getQuantity(),b.getName(),b.getDiscount(),b.getPrice()});
			
		}
	}
}
