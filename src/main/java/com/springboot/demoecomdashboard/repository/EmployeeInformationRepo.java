package com.springboot.demoecomdashboard.repository;

import com.springboot.demoecomdashboard.entity.CompanyRevenue;
import com.springboot.demoecomdashboard.entity.EmployeeInformation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "employeeInformationRepo")
public interface EmployeeInformationRepo extends JpaRepository<EmployeeInformation, Long>{
    EmployeeInformation findById(final String pk);
}
