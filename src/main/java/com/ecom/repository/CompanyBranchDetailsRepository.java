package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.beans.CompanyBranchDetails;

@Repository
public interface CompanyBranchDetailsRepository extends JpaRepository<CompanyBranchDetails, Integer> {

}
