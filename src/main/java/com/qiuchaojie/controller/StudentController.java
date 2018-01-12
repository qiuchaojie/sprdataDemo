package com.qiuchaojie.controller;

import com.qiuchaojie.dao.StudentDao;
import com.qiuchaojie.dto.StudentListDto;
import com.qiuchaojie.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
@RequestMapping("/student")
@RestController
@EnableAutoConfiguration
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping("findById")
    public StudentListDto findById(Long id) {
        Student student = studentDao.findOne(id);
        StudentListDto dto = new StudentListDto(student);
        //DTO:data transfer object
        return dto;
    }

    @RequestMapping("findByLastName")
    public Student findByLastName(String lastName) {
        Student student = studentDao.getByLastName(lastName);
        return student;
    }

    @RequestMapping("findByFirstName")
    public Student findByFirstName(String firstName) {
        Student student = studentDao.getByFirstName(firstName);
        return student;
    }

    @RequestMapping("getByFirstNameAndAge")
    public Student getByFirstNameAndAge(String firstName, int age) {
        Student student = studentDao.getByFirstNameAndAge(firstName, age);
        return student;
    }
}