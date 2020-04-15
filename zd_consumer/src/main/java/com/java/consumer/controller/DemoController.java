package com.java.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commons.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:容磊
 * time:2020/4/11  16:43
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @Reference(version = "1.0.0")
    private DemoService demoService;
    @RequestMapping("/test01/{userName}")
    public @ResponseBody String test01(@PathVariable("userName") String userName){
        try {
            return demoService.test01(userName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
