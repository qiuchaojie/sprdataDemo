package com.qiuchaojie.controller;

import com.qiuchaojie.dao.StudentDao;
import com.qiuchaojie.dto.StudentListDto;
import com.qiuchaojie.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


    @RequestMapping("list")
    public List<StudentListDto> list() {
        Pageable pageable = new PageRequest(0,1);
        Page<Student> students = studentDao.findAll(pageable);
        List<Student> list = students.getContent();
        List<StudentListDto> dtos = new ArrayList<>();
        for(Student student : students){
            dtos.add(new StudentListDto(student));
        }
        return dtos;
    }

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
