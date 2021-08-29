package com.example.moneyconverter.controller;

import com.example.moneyconverter.service.IMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ConvertController {

    IMoney iMoney;

    @Autowired
    public ConvertController(IMoney iMoney) {
        this.iMoney = iMoney;
    }
    @PostMapping("/exchangeMoney")
    public Double exchangeMoney(@PathVariable int id,@PathVariable double money){
        return iMoney.exchangeMoney(id,money);
    }
}
