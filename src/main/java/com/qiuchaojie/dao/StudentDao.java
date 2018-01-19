package com.qiuchaojie.dao;

import com.qiuchaojie.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
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
public interface StudentDao extends BaseDao<Student, Long> {

    Student getByLastName(String lastName);

    Student getByFirstName(String firstName);

    Student getByFirstNameAndAge(String firstName, int age);
}
