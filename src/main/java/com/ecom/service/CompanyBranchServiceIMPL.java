package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.beans.CompanyBranchDetails;
import com.ecom.repository.CompanyBranchDetailsRepository;

@Service
public class CompanyBranchServiceIMPL implements CompanyBranchService {
	
	@Autowired
	CompanyBranchDetailsRepository companyBranchDetailsRepository;

	@Override
	public CompanyBranchDetails addCompanyBranchDetails(CompanyBranchDetails details) {
		// TODO Auto-generated method stub
		return companyBranchDetailsRepository.save(details);
	}

	@Override
	public void updateCompanyBranchDetails(CompanyBranchDetails details) {
		// TODO Auto-generated method stub
		companyBranchDetailsRepository.save(details);
	}

	@Override
	public List<CompanyBranchDetails> getAllCompanyBranchDetails() {
		// TODO Auto-generated method stub
		return companyBranchDetailsRepository.findAll();
	}

	@Override
	public void deleteCompanyBranchDetailsById(int id) {
		// TODO Auto-generated method stub
		companyBranchDetailsRepository.deleteById(id);
	}

	@Override
	public CompanyBranchDetails getCompanyBranchDetailsById(int id) {
		// TODO Auto-generated method stub
		return companyBranchDetailsRepository.getById(id);
	}

}
