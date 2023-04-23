package com.service;

import java.util.List;

import com.mode.Cashier;

public interface CashierService {
	boolean addCashier(Cashier c);
	boolean deleteCashier(int id);
	boolean updateCashier(Cashier c);
	List<Cashier> getAllCashier();
	

}
