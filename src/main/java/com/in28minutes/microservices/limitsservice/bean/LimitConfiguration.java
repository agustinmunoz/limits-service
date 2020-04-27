package com.in28minutes.microservices.limitsservice.bean;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

//@REfreshScope para actualizar config sin tener que reiniciar

@RefreshScope
@Configuration
public class LimitConfiguration {

    private int maximun;
    private int minimun;


    public LimitConfiguration() {
    }

    public LimitConfiguration(int maximun, int minimun) {
        this.maximun = maximun;
        this.minimun = minimun;
    }

    public int getMaximun() {
        return maximun;
    }

    public void setMaximun(int maximun) {
        this.maximun = maximun;
    }

    public int getMinimun() {
        return minimun;
    }

    public void setMinimun(int minimun) {
        this.minimun = minimun;
    }
}
