package com.qiuchaojie.dto;

import com.qiuchaojie.entity.Book;
import com.qiuchaojie.entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiuchaojie on 2018/1/12.
 */
public class StudentListDto {

    private Long id;
    private Integer age;
    private String firstName;
    private String lastName;
    private String gender;
    private Set<BookListDto> books = new HashSet<>();

    public StudentListDto(Student student) {
        this.id = student.getId();
        this.age = student.getAge();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.gender = student.getGender();
        for(Book book: student.getBooks()){
            books.add(new BookListDto(book));
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<BookListDto> getBooks() {
        return books;
    }

    public void setBooks(Set<BookListDto> books) {
        this.books = books;
    }
}
