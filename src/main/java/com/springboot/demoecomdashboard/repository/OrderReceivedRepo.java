package com.springboot.demoecomdashboard.repository;

import com.springboot.demoecomdashboard.entity.OrderReceived;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "orderReceivedRepo")
public interface OrderReceivedRepo extends JpaRepository<OrderReceived, Long> {
}
