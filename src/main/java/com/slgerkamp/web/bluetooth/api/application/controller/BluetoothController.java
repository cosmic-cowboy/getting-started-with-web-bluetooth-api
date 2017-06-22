package com.slgerkamp.web.bluetooth.api.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BluetoothController {

    @RequestMapping("/")
    public String index(){
    	return "index";
    }
}
