package com.springboot.demoecomdashboard.repository;

import com.springboot.demoecomdashboard.entity.CompanyRevenue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "companyRevenueRepo")
public interface CompanyRevenueRepo extends JpaRepository<CompanyRevenue, Long> {

}
