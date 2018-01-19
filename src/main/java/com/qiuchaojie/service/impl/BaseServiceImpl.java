package com.qiuchaojie.service.impl;

import com.qiuchaojie.dao.BaseDao;
import com.qiuchaojie.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by qiuchaojie on 2018/1/16.
 */
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    /** baseDao */
    private BaseDao<T, ID> baseDao;

    @Autowired
    public void setBaseDao(BaseDao<T, ID> baseDao) {
        this.baseDao = baseDao;
    }

    protected BaseDao<T, ID> getBaseDao() {
        return baseDao;
    }

    @Override
    public T findOne(ID id) {
        return baseDao.findOne(id);
    }
}
