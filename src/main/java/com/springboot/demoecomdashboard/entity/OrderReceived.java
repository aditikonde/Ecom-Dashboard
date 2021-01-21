package com.springboot.demoecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderReceived", schema="ecomDashBoard")
public class OrderReceived extends KeyEntity{
    private int orderReceived;
    private String DateReceived;

    public int getOrderReceived() {
        return orderReceived;
    }

    public void setOrderReceived(int orderReceived) {
        this.orderReceived = orderReceived;
    }

    public String getDateReceived() {
        return DateReceived;
    }

    public void setDateReceived(String dateReceived) {
        DateReceived = dateReceived;
    }
}
