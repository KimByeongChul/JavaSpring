package com.aop_bean;

import com.aop_bean.business.HumanService;
import com.aop_bean.domain.Human;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.beancontext.BeanContext;

public class Aop_beanRun {
    public static void main(String[] args) {
        Aop_beanRun aop_beanRun = new Aop_beanRun();
        aop_beanRun.execute();
    }

    public void execute(){
        BeanFactory ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        HumanService humanService = ctx.getBean(HumanService.class);

        humanService.createHuman("김병철",23);

        Human human = humanService.findByName("김병철");
        System.out.println(human);
    }
}
