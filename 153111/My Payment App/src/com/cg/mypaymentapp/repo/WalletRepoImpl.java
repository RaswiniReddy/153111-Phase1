package com.cg.mypaymentapp.repo;

import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;

public class WalletRepoImpl implements WalletRepo {

	private Map<String, Customer> data;

	public WalletRepoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}
	
	public boolean save(Customer customer) {
		if(customer!=null)
		{
			data.put(customer.getMobileNo(), customer);
			return true;
		}
		return false;
	}

	public Customer findOne(String mobileNo) {
		if(data.containsKey(mobileNo))
		{
			return data.get(mobileNo);
		}
		return null;
	}
}
