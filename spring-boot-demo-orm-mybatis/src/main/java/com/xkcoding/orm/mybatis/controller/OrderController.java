package com.xkcoding.orm.mybatis.controller;

import com.xkcoding.orm.mybatis.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:04 2019/08/28
 */
@Api(description = "支付接口")
@Controller
@RequestMapping(value = "pay")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "选择支付方式", notes = "支付")
    @PostMapping(value = "/calc")
    @ResponseBody
    public String calcAmount(@RequestParam String payId){
        return orderService.getPay(payId);
    }
}
