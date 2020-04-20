package com.in28minutes.microservices.limitsservice;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Value("${limits-service.maximun}")
    private Integer maximun;

    @Value("${limits-service.minimun}")
    private Integer minimun;


    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){

        return new LimitConfiguration(maximun,minimun);
    }

}
