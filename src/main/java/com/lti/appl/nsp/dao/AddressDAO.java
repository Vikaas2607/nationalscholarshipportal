package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.Address;



public interface AddressDAO {
	public void addAddress(Address addObj);                                     
	public void deleteAddress(int addressId);
	public void updateAddress(Address updateObj);
	public List<Address> getAddressByAadhar(String aadhar);
//	public List<Address> getAddress(int instituteCode);
	public List<Address> getAllAddress();
}
