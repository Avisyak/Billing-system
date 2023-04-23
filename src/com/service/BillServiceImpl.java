package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Db.Db;
import com.mode.Bill;

public class BillServiceImpl implements billService{

	@Override
	public boolean addbill(Bill b) {
		String sql = "insert into bill(id,billno,customername,name,price,quantity,Discount)values('"+b.getBillno()+"','"+b.getId()+"','"+b.getCustomername()+"','"+b.getName()+"','"+b.getPrice()+"','"+b.getQuantity()+"','"+b.getDiscount()+"')";
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
	public boolean removebill(int id) {
		
		return false;
	}

	@Override
	public List<Bill> getAllBill() {
		List<Bill> blist= new ArrayList<>();
		String sql = "select *from bill";
		try {
			Statement stm = Db.connectDb().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Bill b = new Bill();
				b.setQuantity(rs.getInt("quantity"));
				b.setName(rs.getString("name"));
				b.setDiscount(rs.getString("Discount"));
				b.setPrice(rs.getInt("price"));
		
				
				blist.add(b);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blist;
	}

}
