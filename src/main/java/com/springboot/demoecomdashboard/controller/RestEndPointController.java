package com.springboot.demoecomdashboard.controller;

import com.springboot.demoecomdashboard.entity.EmployeeInformation;
import com.springboot.demoecomdashboard.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEndPointController {

    @Autowired
    private DashBoardService dashBoardService;

    @RequestMapping("/employees")
    public List<EmployeeInformation> getAllEmployees(){
        return dashBoardService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee/add")
    public String saveEmployee(@RequestBody EmployeeInformation employeeInformation) {
        if (dashBoardService.addEmployee(employeeInformation) != null) {
            return "Employee information saved successfully";
        } else {
            return "Error in saving employee information";
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/delete")
    public String deleteEmployee(@RequestParam(name="empId", required = true)String pk) {
        try {
            dashBoardService.deleteEmployee(dashBoardService.getEmployee(pk));
            return "Employee Record Delete";
        } catch (Exception e) {
            return "Error";
        }

    }
}
