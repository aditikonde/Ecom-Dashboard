package com.springboot.demoecomdashboard.repository;

import com.springboot.demoecomdashboard.entity.CompanyRevenue;
import com.springboot.demoecomdashboard.entity.OrderCollectionStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "orderCollectionStatusRepo")
public interface OrderCollectionStatusRepo extends JpaRepository<OrderCollectionStatus, Long> {
}
