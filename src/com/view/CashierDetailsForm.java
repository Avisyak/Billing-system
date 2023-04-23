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
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mode.Cashier;
import com.service.CashierService;
import com.service.CashierServiceImpl;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierDetailsForm extends JFrame {

	private JPanel contentPane;
	private JLabel txtCashierdetails;
	private JLabel lblNewLabel;
	private JTextField txtId;
	private JTextField txtname;
	private JTextField txtnumber;
	private JTextField txtaddress;
	private JTextField txtemail;
	private JPasswordField txtpsw;
	private JLabel lblCashierName;
	private JLabel lblMobileNumber;
	private JLabel lblAddress;
	private JLabel lblEmailid;
	private JLabel lblPassword;
	private JSeparator separator;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JButton btnadd;
	private JButton btnupdate;
	private JButton btndelete;
	private int cid=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierDetailsForm frame = new CashierDetailsForm();
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
	public CashierDetailsForm() {
		setFont(new Font("Dialog", Font.BOLD, 14));
		setForeground(new Color(0, 0, 0));
		setTitle("                                                                                                                                          Add Cashier");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dell\\Downloads\\302008777_171168755475840_4651879456345235236_n.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 480);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtCashierdetails());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtId());
		contentPane.add(getTxtname());
		contentPane.add(getTxtnumber());
		contentPane.add(getTxtaddress());
		contentPane.add(getTxtemail());
		contentPane.add(getTxtpsw());
		contentPane.add(getLblCashierName());
		contentPane.add(getLblMobileNumber());
		contentPane.add(getLblAddress());
		contentPane.add(getLblEmailid());
		contentPane.add(getLblPassword());
		contentPane.add(getSeparator());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnadd());
		contentPane.add(getBtnupdate());
		contentPane.add(getBtndelete());
		DisplayData();
	}

	private JLabel getTxtCashierdetails() {
		if (txtCashierdetails == null) {
			txtCashierdetails = new JLabel("   Add  Cashier Details");
			txtCashierdetails.setForeground(new Color(71, 71, 71));
			txtCashierdetails.setFont(new Font("Tahoma", Font.BOLD, 30));
			txtCashierdetails.setBounds(10, 11, 349, 59);
		}
		return txtCashierdetails;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Cashier Id");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(50, 100, 70, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTxtId() {
		if (txtId == null) {
			txtId = new JTextField();
			txtId.setBounds(167, 100, 177, 20);
			txtId.setColumns(10);
		}
		return txtId;
	}
	private JTextField getTxtname() {
		if (txtname == null) {
			txtname = new JTextField();
			txtname.setBounds(167, 147, 177, 20);
			txtname.setColumns(10);
		}
		return txtname;
	}
	private JTextField getTxtnumber() {
		if (txtnumber == null) {
			txtnumber = new JTextField();
			txtnumber.setBounds(167, 195, 177, 20);
			txtnumber.setColumns(10);
		}
		return txtnumber;
	}
	private JTextField getTxtaddress() {
		if (txtaddress == null) {
			txtaddress = new JTextField();
			txtaddress.setBounds(167, 235, 177, 20);
			txtaddress.setColumns(10);
		}
		return txtaddress;
	}
	private JTextField getTxtemail() {
		if (txtemail == null) {
			txtemail = new JTextField();
			txtemail.setBounds(167, 281, 177, 20);
			txtemail.setColumns(10);
		}
		return txtemail;
	}
	private JPasswordField getTxtpsw() {
		if (txtpsw == null) {
			txtpsw = new JPasswordField();
			txtpsw.setBounds(167, 331, 177, 20);
		}
		return txtpsw;
	}
	private JLabel getLblCashierName() {
		if (lblCashierName == null) {
			lblCashierName = new JLabel("Cashier Name");
			lblCashierName.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblCashierName.setBounds(50, 149, 94, 14);
		}
		return lblCashierName;
	}
	private JLabel getLblMobileNumber() {
		if (lblMobileNumber == null) {
			lblMobileNumber = new JLabel("Mobile Number");
			lblMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblMobileNumber.setBounds(50, 197, 94, 14);
		}
		return lblMobileNumber;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblAddress.setBounds(50, 237, 94, 14);
		}
		return lblAddress;
	}
	private JLabel getLblEmailid() {
		if (lblEmailid == null) {
			lblEmailid = new JLabel("Email-Id");
			lblEmailid.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblEmailid.setBounds(50, 283, 94, 14);
		}
		return lblEmailid;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPassword.setBounds(50, 333, 94, 14);
		}
		return lblPassword;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(420, 11, -6, 432);
		}
		return separator;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(464, 98, 83, -47);
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(408, 0, 541, 443);
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int crow = table.getSelectedRow();
					cid=(int) table.getModel().getValueAt(crow, 0);
					txtname.setText(table.getModel().getValueAt(crow, 1).toString());
					txtnumber.setText(table.getModel().getValueAt(crow, 2).toString());
					txtaddress.setText(table.getModel().getValueAt(crow, 3).toString());
					txtemail.setText(table.getModel().getValueAt(crow, 4).toString());
					txtpsw.setText(table.getModel().getValueAt(crow, 5).toString());
					btnadd.setEnabled(false);
					btnupdate.setEnabled(true);
					
					
				}
			});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Name", "Number", "Address", "Email", "Password"
				}
			));
		}
		return table;
	}
	private JButton getBtnupdate() {
		if (btnupdate == null) {
			btnupdate = new JButton("Update");
			btnupdate.setEnabled(false);
			btnupdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String Name=txtname.getText();
					String Number=txtnumber.getText();
					String Address=txtaddress.getText();
					String Email=txtemail.getText();
					String Password=txtpsw.getText();
					
					Cashier c = new Cashier();
					c.setName(Name);
					c.setNumber(Number);
					c.setAddress(Address);
					c.setEmail(Email);
					c.setPassword(Password);
					
					CashierService cs = new CashierServiceImpl();
					if(cs.updateCashier(c)) {
						JOptionPane.showMessageDialog(null, "Data update Success");
						DisplayData();
					}else {
						JOptionPane.showMessageDialog(null, "data update failed");
						
					}
				}
			});
			btnupdate.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\update.png"));
			btnupdate.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnupdate.setBounds(167, 394, 104, 39);
		}
		return btnupdate;
	}
	private JButton getBtnadd() {
		if (btnadd == null) {
			btnadd = new JButton("Addnew");
			btnadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String Name = txtname.getText();
					String Number = txtnumber.getText();
					String Address = txtaddress.getText();
					String Email= txtemail.getText();
					String Password=txtpsw.getText();
					
					Cashier c = new Cashier();
					c.setName(Name);
					c.setNumber(Number);
					c.setAddress(Address);
					c.setEmail(Email);
					c.setPassword(Password);
					
					CashierService cs = new CashierServiceImpl();
					if(cs.addCashier(c)) {
						JOptionPane.showMessageDialog(null, "add new data success");
						DisplayData();
					}else {
						JOptionPane.showMessageDialog(null, "add new data failed");
						
					}
					
					
				}
			});
			btnadd.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\addd1.png"));
			btnadd.setSelectedIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\add.png"));
			btnadd.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnadd.setBounds(37, 394, 115, 38);
		}
		return btnadd;
	}
	
	private JButton getBtndelete() {
		if (btndelete == null) {
			btndelete = new JButton("Delete");
			btndelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Select any row");
						return;
						
					}
					int crow = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(crow, 0);
					
					CashierService cs = new CashierServiceImpl();
					if(cs.deleteCashier(id)) {
						JOptionPane.showMessageDialog(null, "Delete successs");
						DisplayData();
						
					}else {
						JOptionPane.showMessageDialog(null, "deleton failed");
						
					}
				}
			});
			btndelete.setIcon(new ImageIcon("C:\\Users\\dell\\Downloads\\delete.png"));
			btndelete.setFont(new Font("Tahoma", Font.BOLD, 12));
			btndelete.setBounds(281, 394, 104, 39);
		}
		return btndelete;
		
	}
	private void DisplayData() {
		CashierService cs = new CashierServiceImpl();
		List<Cashier> clist=cs.getAllCashier();
		
		DefaultTableModel tmodel= (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		for(Cashier c:clist) {
			tmodel.addRow(new Object[] {c.getID(),c.getName(),c.getNumber(),c.getAddress(),c.getEmail(),c.getPassword()});
			
		}
	}
}
