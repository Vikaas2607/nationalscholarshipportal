package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.Address;
@Repository
public class AddressDAOImpl implements AddressDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	public void addAddress(Address addObj) {
		System.out.println("entityManager");
		entityManager.persist(addObj);
	}

	@Transactional
	public void deleteAddress(int addressId) {
		Address address = entityManager.find(Address.class, addressId);
		entityManager.remove(address);
	}

	@Override
	public void updateAddress(Address updateObj) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<Address> getAddressByAadhar(String aadhar) {
		List<Address> address = entityManager.createQuery(" from Address where aadhar=:aadhar")
				.setParameter("aadhar", aadhar).getResultList();
		return address;
	}

	@Transactional
	public List<Address> getAllAddress() {
		List<Address> address = entityManager.createQuery(" from Address").getResultList();
		return address;
	}

}
