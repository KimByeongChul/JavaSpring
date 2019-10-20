package com.aop_bean.dao;

import com.aop_bean.domain.Human;

import java.util.HashMap;
import java.util.Map;

public class HumanDaoImpl implements HumanDao {
    Map<String,Human> DataBase = new HashMap<>();

    @Override
    public void createHuman(Human human) {
        DataBase.put(human.getName(),human);
    }

    @Override
    public Human findByName(String name) {
        return DataBase.get(name);
    }
}
