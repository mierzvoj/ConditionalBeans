package com.example.conditionalbeans.pjatk;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {
    @Bean
    public ComponentOne testOne() {
        return new ComponentOne("First Bean ready");
    }

    @Bean(name="componentTwo")
    @ConditionalOnProperty(name="beanswitch", havingValue="true")
    public ComponentTwo testTwo(){
        return new ComponentTwo("Second Bean ready");
    }
}
