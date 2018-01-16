package com.qiuchaojie.dao;

import com.qiuchaojie.dto.BookDetailDto;
import com.qiuchaojie.entity.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

/**
 *
 * @author qiuchaojie
 * @date 2018/1/12
 */
@Repository
@Table(name="t_book")
@Qualifier("bookDao")
public interface BookDao extends PagingAndSortingRepository<Book, Long>,JpaSpecificationExecutor<Book> {


    /**
     * 根据id查询book详情
     * @param bookId
     * @return
     */
    @Query("select new com.qiuchaojie.dto.BookDetailDto(b.student.id,b.student.lastName,b.student.firstName,b.student.age," +
            "b.id,b.name,b.price) from Book b where b.id = :bookId")
    BookDetailDto findBookAndStudent(@Param("bookId") long bookId);


    /**
     * 根据firstName查询lastName
     * @param firstName
     * @return
     */
    @Query("select b.name from Book b where b.type = ?1")
    List<String> allNameByType(String firstName);
}
