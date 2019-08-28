package com.example.demo.controller;

import com.example.demo.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        return resultVO;
    }

}

