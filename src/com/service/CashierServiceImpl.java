package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Db.Db;
import com.mode.Cashier;

public class CashierServiceImpl implements CashierService{

	@Override
	public boolean addCashier(Cashier c) {
		String sql = "insert into cashier(Name,Number,Address,Email,Password)values('"+c.getName()+"','"+c.getNumber()+"','"+c.getAddress()+"','"+c.getEmail()+"','"+c.getPassword()+"')";
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
	public boolean deleteCashier(int  id) {
		 String sql = "Delete from cashier where id='"+id+"'";
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
	public boolean updateCashier(Cashier c) {
		String sql = "update cashier set Name='"+c.getName()+"',Number='"+c.getNumber()+"',Address='"+c.getAddress()+"',Email='"+c.getEmail()+"',Password='"+c.getPassword()+"'";
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
	public List<Cashier> getAllCashier() {
		List<Cashier> clist= new ArrayList<>();
		String sql = "select *from cashier";
		try {
			Statement stm=Db.connectDb().createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				Cashier c = new Cashier();
				c.setID(rs.getInt("ID"));
				c.setName(rs.getString("Name"));
				c.setNumber(rs.getString("Number"));
				c.setAddress(rs.getString("Address"));
				c.setEmail(rs.getString("Email"));
				c.setPassword(rs.getString("Password"));
				
				clist.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return clist;
	}

}
