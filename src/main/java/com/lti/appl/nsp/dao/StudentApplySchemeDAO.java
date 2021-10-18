package com.lti.appl.nsp.dao;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.beans.StudentDisabilityDetail;
import com.lti.appl.nsp.beans.StudentDocumentDetail;
import com.lti.appl.nsp.beans.StudentFeeDetail;
import com.lti.appl.nsp.beans.StudentPersonalDetail;

public interface StudentApplySchemeDAO {
	public void	insertIntoStudentApplicationFormViaAadhar(Address address,
			StudentAcademicDetail studentAcademicDetail, 
			StudentDisabilityDetail studentDisabilityDetail,
			StudentDocumentDetail studentDocumentDetail,
			StudentPersonalDetail studentPersonalDetail,
			StudentFeeDetail studentFeeDetail);
}
