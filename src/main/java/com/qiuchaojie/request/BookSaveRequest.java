package com.qiuchaojie.request;

import java.math.BigDecimal;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
public class BookSaveRequest {

    private Long id;

    private String name;

    private String type;

    private BigDecimal price;

    private Long studentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
