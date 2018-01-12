package com.qiuchaojie.dto;

import com.qiuchaojie.entity.Book;

import java.math.BigDecimal;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
public class BookListDto {

    private Long id;
    private String name;
    private String type;
    private BigDecimal price;

    public BookListDto(Book book) {
        this.id= book.getId();
        this.name = book.getName();
        this.type = book.getType();
        this.price = book.getPrice();
    }

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
}
