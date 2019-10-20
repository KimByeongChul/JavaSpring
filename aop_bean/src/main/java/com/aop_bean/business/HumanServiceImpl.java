package com.aop_bean.business;

import com.aop_bean.dao.HumanDao;
import com.aop_bean.domain.Human;

public class HumanServiceImpl implements HumanService {
    private HumanDao humanDao;

    public void setHumanDao(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    @Override
    public void createHuman(String name, int age) {
        humanDao.createHuman(new Human(name, age));
    }

    @Override
    public Human findByName(String name) {
        return humanDao.findByName(name);
    }
}
