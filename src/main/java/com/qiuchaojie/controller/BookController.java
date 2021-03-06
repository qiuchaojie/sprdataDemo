package com.qiuchaojie.controller;

import com.qiuchaojie.dao.BookDao;
import com.qiuchaojie.dao.StudentDao;
import com.qiuchaojie.dto.BookDetailDto;
import com.qiuchaojie.entity.Book;
import com.qiuchaojie.entity.Student;
import com.qiuchaojie.request.BookSaveRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
@RequestMapping("/book")
@RestController
@EnableAutoConfiguration
public class BookController {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private StudentDao studentDao;


    @RequestMapping("/save")
    public void save(BookSaveRequest request){
        Book book;
        if(null != request.getId()){
            book = bookDao.findOne(request.getId());
        }else{
            book = new Book();
        }
        book.setName(request.getName());
        book.setPrice(request.getPrice());
        book.setType(request.getType());
        if(null != request.getStudentId()){
            Student student = studentDao.findOne(request.getStudentId());
            book.setStudent(student);
        }
        bookDao.save(book);
    }


    @RequestMapping("/findCascade")
    public BookDetailDto findCascade(Integer id){
        BookDetailDto dto = bookDao.findBookAndStudent(id);
        return dto;
    }


    @RequestMapping("/allNameByType")
    public List<String> getIWant(String type){
        List<String> dto = bookDao.allNameByType(type);
        return dto;
    }


    @RequestMapping("/showBookFromWeb/{id}")
    public void showBookFromWeb(@PathVariable("id") Book book){
        System.out.println(book);
    }


    @RequestMapping("buyBook/{studentId}/{bookId}")
    public void buyBook(@PathVariable("bookId") Book book, @PathVariable("studentId") Student student){
        book.setStudent(student);
        bookDao.save(book);
    }
}
