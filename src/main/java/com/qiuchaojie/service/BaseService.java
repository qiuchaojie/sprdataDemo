package com.qiuchaojie.service;

import java.io.Serializable;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/16
 */
public interface BaseService<T, ID extends Serializable> {


    T findOne(ID id);


}
