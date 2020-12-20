package com.xzc.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xzc
 * @Description: 测试
 * @date 2020/12/20 14:11
 */
@RestController
public class TestController {

    @GetMapping("/getUser")
    public String getUser(){
        return "gateway 服务调用";
    }
}
