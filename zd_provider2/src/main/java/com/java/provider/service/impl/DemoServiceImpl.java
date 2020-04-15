package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.service.DemoService;

/**
 * author:容磊
 * time:2020/4/11  16:03
 */
@Service(version = "1.0.0")//dubbo容器的实例化注解
public class DemoServiceImpl implements DemoService {
    @Override
    public String test01(String userName) throws Exception {
        System.out.println("这时走的是provider2方法。。。");
        return userName;
    }
}
