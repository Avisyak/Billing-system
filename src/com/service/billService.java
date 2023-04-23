package com.service;

import java.util.List;

import com.mode.Bill;

public interface billService {
	boolean addbill(Bill b);
	boolean removebill(int id);
	List<Bill> getAllBill();
	

}
