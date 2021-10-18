package com.lti.appl.nsp.dao;

import com.lti.appl.nsp.beans.StudentBasicDetail;

public interface StudentLoginDAO {

	boolean isPresent(String aadhar, String Password);
}
