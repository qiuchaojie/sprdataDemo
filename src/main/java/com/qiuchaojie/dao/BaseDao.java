package com.qiuchaojie.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/16
 */
@NoRepositoryBean
public interface BaseDao<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>,JpaSpecificationExecutor<T> {


    //TODO: 添加额外的方法以实现更加复杂的业务需求（JPA2.0支持Criteria查询,接口是JpaSpecificationExecutor）

}
