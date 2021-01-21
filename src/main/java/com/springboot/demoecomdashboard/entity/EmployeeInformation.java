package com.springboot.demoecomdashboard.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="EmployeeInformation", schema="ecomDashBoard")
public class EmployeeInformation extends KeyEntity{

    private String name;
    private String position;
    private Date startDate;
    private int age;
    private String officeLocation;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
