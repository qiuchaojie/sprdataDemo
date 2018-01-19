package com.qiuchaojie.service.impl;

import com.qiuchaojie.dao.StudentDao;
import com.qiuchaojie.dto.StudentDetailDto;
import com.qiuchaojie.entity.Student;
import com.qiuchaojie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/16
 */
@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student, Long> implements StudentService        {

    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Override
    public Student getByLastName(String lastName) {
        return studentDao.getByLastName(lastName);
    }
}
