package com.springboot.demoecomdashboard.service.impl;

import com.springboot.demoecomdashboard.entity.*;
import com.springboot.demoecomdashboard.repository.*;
import com.springboot.demoecomdashboard.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@Service
public class DashBoardServiceImpl implements DashBoardService {
    @Autowired
    private CompanyRevenueRepo companyRevenueRepo;

    @Autowired
    private EmployeeInformationRepo employeeInformationRepo;

    @Autowired
    private OrderCollectionStatusRepo orderCollectionStatusRepo;

    @Autowired
    private OrderReceivedRepo orderReceivedRepo;

    @Autowired
    private ProductCategoryRepo productCategoryRepo;



    @Override
    public HashMap<String, Object> getTodayRevenueDash() {
        HashMap<String, Object> populateCompanyRev = new HashMap<>();
        List<CompanyRevenue> companyRevenueList = companyRevenueRepo.findAll();

        List<String> label = new ArrayList<>();
        List<String> revenue = new ArrayList<>();

        double totalMargin = 0;
        double totalExpense = 0;
        double totalRevenue = 0;

        Locale locale = new Locale("en", "In");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for (CompanyRevenue companyRevenue : companyRevenueList) {
            label.add(companyRevenue.getMonth());
            revenue.add(String.valueOf(companyRevenue.getRevenue()));
            totalExpense = totalExpense + companyRevenue.getExpense();
            totalMargin = totalMargin + companyRevenue.getMargin();
            totalRevenue = totalRevenue + companyRevenue.getRevenue();
        }

        // cr is company revenue

        populateCompanyRev.put("crLabels", label.toString());
        populateCompanyRev.put("crRevenue", revenue.toString());
        populateCompanyRev.put("totalExpense", currencyFormatter.format(totalExpense));
        populateCompanyRev.put("totalMargin", currencyFormatter.format(totalMargin));
        populateCompanyRev.put("totalRevenue", currencyFormatter.format(totalRevenue));

        return populateCompanyRev;
    }

    @Override
    public HashMap<String, Object> getBestCategory() {
        HashMap<String, Object> bestCategoryList = new HashMap<>();
        List<ProductCategory> productCategoryList = productCategoryRepo.findByBestCategory(true);

        List<String> category = new ArrayList<>();
        List<String> percent = new ArrayList<>();

        for(ProductCategory productCat : productCategoryList ){
            category.add(productCat.getCategoryName());
            percent.add(String.valueOf(productCat.getPercentage()));
        }

        bestCategoryList.put("bestCategory",category.toString());
        bestCategoryList.put("percent",percent.toString());
        return bestCategoryList;
    }

    @Override
    public HashMap<String, Object> getAllOrderReceived() {
        HashMap<String, Object> allOrderReceived = new HashMap<>();
        List<OrderReceived> orderList = orderReceivedRepo.findAll();

        List<String> dates = new ArrayList<>();
        List<String> order = new ArrayList<>();

        for (OrderReceived orderReceived : orderList) {
            dates.add(orderReceived.getDateReceived());
            order.add(String.valueOf(orderReceived.getOrderReceived()));
        }

        allOrderReceived.put("orDates", dates.toString());
        allOrderReceived.put("orOrder", order.toString());
        return allOrderReceived;
    }

    @Override
    public List<OrderCollectionStatus> getOrderCollection() {
        return orderCollectionStatusRepo.findAll();
    }

    @Override
    public List<EmployeeInformation> getAllEmployee() {
        return employeeInformationRepo.findAll();
    }

    @Override
    public EmployeeInformation getEmployee(String pk) {
        return employeeInformationRepo.findById(pk);
    }

    @Override
    public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepo.save(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepo.save(employeeInformation);
    }

    @Override
    public void deleteEmployee(EmployeeInformation employeeInformation) {
        employeeInformationRepo.delete(employeeInformation);
    }
}
