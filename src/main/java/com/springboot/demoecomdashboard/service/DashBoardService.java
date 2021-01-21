package com.springboot.demoecomdashboard.service;

import com.springboot.demoecomdashboard.entity.*;

import java.util.HashMap;
import java.util.List;

public interface DashBoardService {
    HashMap<String, Object> getTodayRevenueDash();

    HashMap<String, Object> getBestCategory();

    HashMap<String, Object> getAllOrderReceived();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);
}
