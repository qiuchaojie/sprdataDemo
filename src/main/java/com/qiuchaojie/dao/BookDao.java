package com.qiuchaojie.dao;

import com.qiuchaojie.entity.Book;
import com.qiuchaojie.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
@Repository
@Table(name="t_book")
@Qualifier("bookDao")
public interface BookDao extends CrudRepository<Book, Long > {


}
