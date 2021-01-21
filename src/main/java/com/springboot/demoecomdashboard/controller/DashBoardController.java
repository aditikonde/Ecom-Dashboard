package com.springboot.demoecomdashboard.controller;

import com.springboot.demoecomdashboard.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;

    @GetMapping("/")
    public String getDashDetail(Model model) {

        // cr - company revenue
        model.addAttribute("cr", dashBoardService.getTodayRevenueDash());

        // ei - employee information
        model.addAttribute("ei", dashBoardService.getAllEmployee());

        // or - order received
        model.addAttribute("ord", dashBoardService.getAllOrderReceived());

        // bs - best seller
        model.addAttribute("bc", dashBoardService.getBestCategory());

        return "/index";
    }
}
