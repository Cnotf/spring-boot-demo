package com.xkcoding.orm.mybatis.service.impl;

import com.xkcoding.orm.mybatis.service.Pay;
import com.xkcoding.orm.mybatis.service.PayNote;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:10 2019/08/28
 */
@PayNote(value = "2")
public class BOCPay implements Pay {

    @Override
    public String getPayAmount() {
        return "0.7";
    }
}
