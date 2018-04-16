/**
 * HelloController.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年4月12日
 */
package com.liyiming.springcloud.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**  
 * <p>Title: HelloController</p>  
 * <p>Description: </p>  
 * @author liyiming  
 * @date 2018年4月12日  
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
