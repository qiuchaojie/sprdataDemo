package com.qiuchaojie.dao;

import com.qiuchaojie.entity.Book;
import com.qiuchaojie.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
@Repository
@Table(name="t_student")
@Qualifier("studentDao")
public interface StudentDao extends PagingAndSortingRepository<Student, Long >, JpaSpecificationExecutor<Book> {

    /**
     * 根据姓氏查询学生
     * @param lastName 姓氏
     * @return Student
     */
    Student getByLastName(String lastName);

    /**
     * 根据名字查询学生
     * @param firstName 名字
     * @return
     */
    Student getByFirstName(String firstName);

    /**
     * 根据姓氏和年龄查询学生
     * @param firstName 姓氏
     * @param age 年龄
     * @return
     */
    Student getByFirstNameAndAge(String firstName, int age);
}
