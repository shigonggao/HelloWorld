package com.sgg.springboottest;

import com.sgg.springboottest.entity.Book;
import com.sgg.springboottest.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private BookRepository bookRepository;
    @Test
    void contextLoads() {
        PageRequest pageRequest = PageRequest.of(0,3);
        Page<Book> page = bookRepository.findAll(pageRequest);
        int i =0;
    }

    @Test
    void save(){
        Book book = new Book();
        book.setAuthor("张三");
        book.setName("很纠结案件");
       Book ss = bookRepository.save(book);
        System.out.println(ss);
   }
   @Test
    void findById(){
       Book book = bookRepository.findById(1).get();
       System.out.println(book);
   }

    @Test
    void update(){
        Book book = new Book();
        book.setId(125);
        book.setName("测试");
        System.out.println(bookRepository.save(book)) ;
    }
    @Test
    void deleteById(){
        bookRepository.deleteById(125);
    }
}
