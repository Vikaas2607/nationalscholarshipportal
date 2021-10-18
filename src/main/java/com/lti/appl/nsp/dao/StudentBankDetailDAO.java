package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentBankDetail;

public interface StudentBankDetailDAO {
	public void addStudentBankDetail(StudentBankDetail bankObj);    
	
	public void deleteBankDetail(String accountNo);
	
	public void updateBankDetail(String accountNo,String bankName,String bankIfsc);
	
	public StudentBankDetail getBank(String accountNo);
	
	public List< StudentBankDetail> getAllBankDetail ();
}
