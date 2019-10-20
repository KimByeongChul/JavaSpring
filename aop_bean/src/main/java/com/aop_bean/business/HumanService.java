package com.aop_bean.business;

import com.aop_bean.domain.Human;

public interface HumanService {
    void createHuman(String name, int age);
    Human findByName(String name);
}
