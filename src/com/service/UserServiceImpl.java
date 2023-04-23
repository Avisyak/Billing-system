package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.Db.Db;
import com.mode.User;
import com.view.QuickBillHomeform;
import com.view.WelcomeForm;



public class UserServiceImpl implements UserService {

	@Override
	public boolean Signup(User u) {
		String sql = "insert into user(Firstname,Lastname,Username,Password,Repassword,Address)values('"+u.getFirstname()+"','"+u.getLastname()+"','"+u.getUsername()+"','"+u.getPassword()+"','"+u.getRepassword()+"','"+u.getAddress()+"')";
		try {
			Statement stm = Db.connectDb().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean Login(User u) {
	     String sql = "select * from user where Username='"+u.getUsername()+"' and Password='"+u.getPassword()+"'";
	     try {
			Statement stm = Db.connectDb().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "LoginSuccess");
				new QuickBillHomeform().setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Login Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
			
	     
		return false;
	}
	

}
