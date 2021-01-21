package com.springboot.demoecomdashboard.entity;

import javax.persistence.*;

@Entity
@Table(name="CompanyRevenue", schema="ecomDashBoard")
public class CompanyRevenue extends KeyEntity{

    /*

    ********** In place of this : keyentity class ahs been created and
    annotated with mappedSuperClass annotation   ************

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

     */

    @Column(name="revenue_month")
    private String month;

    @Column(name="revenue")
    private double revenue;

    @Column(name="expense")
    private double expense;

    @Column(name="margin")
    private double margin;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }
}
