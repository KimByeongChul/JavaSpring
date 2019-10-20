package com.aop_bean.dao;

import com.aop_bean.domain.Human;

public interface HumanDao {
    void createHuman(Human human);
    Human findByName(String name);
}
