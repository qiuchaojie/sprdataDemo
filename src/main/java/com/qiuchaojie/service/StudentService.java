package com.qiuchaojie.service;

import com.qiuchaojie.entity.Student;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/16
 */
public interface StudentService {

    Student getByLastName(String lastName);
}
