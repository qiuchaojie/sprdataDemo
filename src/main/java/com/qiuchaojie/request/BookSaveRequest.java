package com.qiuchaojie.request;

import com.qiuchaojie.entity.Student;

import java.math.BigDecimal;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
public class BookSaveRequest {

    private String name;

    private String type;

    private BigDecimal price;

    private Integer studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
