package com.qiuchaojie.dto;

import java.math.BigDecimal;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
public class BookDetailDto {

    private Long studentId;
    private String studentLastName;
    private String studentFirstName;
    private Integer studentAge;
    private Long bookId;
    private String bookName;
    private BigDecimal bookPrice;

    public BookDetailDto(Long studentId, String studentLastName, String studentFirstName, Integer studentAge, Long bookId, String bookName, BigDecimal bookPrice) {
        this.studentId = studentId;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentAge = studentAge;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }
}
