package com.xkcoding.orm.mybatis.service;

import org.springframework.stereotype.Service;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:12 2019/08/28
 */
@Service
public class OrderService {

    private Pay pay;

    public String getPay(String payId){

        try {
            pay = PayFactory.newInstance().createPay(payId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*if ("1".equals(payId)) {
            pay = new ABCPay();
        } else if ("2".equals(payId)) {
            pay = new BOCPay();
        } else if ("3".equals(payId)) {
            pay = new CIBPay();
        } else {
            pay = new CMBPay();
        }*/
        return this.pay.getPayAmount();
    }
}
