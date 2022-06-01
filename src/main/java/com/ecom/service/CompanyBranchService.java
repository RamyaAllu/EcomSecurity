package com.ecom.service;

import java.util.List;

import com.ecom.beans.CompanyBranchDetails;

public interface CompanyBranchService {
	
    CompanyBranchDetails addCompanyBranchDetails(CompanyBranchDetails details);
	
	void updateCompanyBranchDetails(CompanyBranchDetails details);
	
	List<CompanyBranchDetails> getAllCompanyBranchDetails();
	
    void deleteCompanyBranchDetailsById(int id);
	
    CompanyBranchDetails getCompanyBranchDetailsById(int id);

}
