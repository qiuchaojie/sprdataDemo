package com.qiuchaojie.dao;

import com.qiuchaojie.entity.Book;
import com.qiuchaojie.entity.BusinessRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/16
 */
@Repository
@Table(name="t_business_record")
@Qualifier("businessRecordDao")
public interface BusinessRecordDao extends PagingAndSortingRepository<BusinessRecord, Long >,JpaSpecificationExecutor<Book> {

}
