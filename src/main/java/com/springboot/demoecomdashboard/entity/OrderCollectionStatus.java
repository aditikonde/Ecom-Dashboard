package com.springboot.demoecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderCollectionStatus", schema="ecomDashBoard")
public class OrderCollectionStatus extends KeyEntity{

    private int newOrder;
    private double revenue;
    private int shipped;
    private int returned;

    public int getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(int newOrder) {
        this.newOrder = newOrder;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public int getShipped() {
        return shipped;
    }

    public void setShipped(int shipped) {
        this.shipped = shipped;
    }

    public int getReturned() {
        return returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }
}
