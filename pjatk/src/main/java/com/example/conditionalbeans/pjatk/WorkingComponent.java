package com.example.conditionalbeans.pjatk;

import org.springframework.context.ApplicationContext;

public class WorkingComponent {
    public WorkingComponent(ApplicationContext applicationContext){
        ComponentOne componentOne = applicationContext.getBean("componentOne", ComponentOne.class);
        ComponentTwo componentTwo = applicationContext.getBean("componentTwo", ComponentTwo.class);
    }
}
