package com.xkcoding.orm.mybatis.service.impl;

import com.xkcoding.orm.mybatis.service.Pay;
import com.xkcoding.orm.mybatis.service.PayNote;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:10 2019/08/28
 */
@PayNote(value = "1")
public class ABCPay implements Pay {

    @Override
    public String getPayAmount() {
        return "0.6";
    }
}
