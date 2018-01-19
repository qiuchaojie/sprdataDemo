package com.qiuchaojie.controller;

import com.qiuchaojie.dao.StudentDao;
import com.qiuchaojie.dto.StudentDetailDto;
import com.qiuchaojie.entity.Student;
import com.qiuchaojie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
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

    @Autowired
    private StudentService studentService;

    @RequestMapping("list")
    public List<StudentDetailDto> list(Pageable pageable) {
        //page=2&size=1&sort=firstName&sort=lastName,asc
        Page<Student> students = studentDao.findAll(pageable);
        List<StudentDetailDto> dtos = new ArrayList<>();
        for(Student student : students){
            dtos.add(new StudentDetailDto(student));
        }
        return dtos;
    }


    @RequestMapping("findById")
    public StudentDetailDto findById(Long id) {
        Student student = studentDao.findOne(id);
        StudentDetailDto dto = new StudentDetailDto(student);
        //DTO:data transfer object
        return dto;
    }


    @RequestMapping("findByLastName")
    public StudentDetailDto findByLastName(String lastName) {
        Student student = studentService.getByLastName(lastName);
        StudentDetailDto dto = new StudentDetailDto(student);
        return dto;
    }


    @RequestMapping("findByFirstName")
    public StudentDetailDto findByFirstName(String firstName) {
        Student student = studentDao.getByFirstName(firstName);
        StudentDetailDto dto = new StudentDetailDto(student);
        return dto;
    }


    @RequestMapping("getByFirstNameAndAge")
    public StudentDetailDto getByFirstNameAndAge(String firstName, int age) {
        Student student = studentDao.getByFirstNameAndAge(firstName, age);
        StudentDetailDto dto = new StudentDetailDto(student);
        return dto;
    }
}
