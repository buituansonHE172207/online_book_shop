package com.kas.online_book_shop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kas.online_book_shop.model.Book;
import com.kas.online_book_shop.model.BookCategory;
import com.kas.online_book_shop.model.BookCollection;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    Page<Book> getAllBooks(Pageable pageable);

    Book saveBook(Book book);

    Book UpdateBook(Book book);

    void DeleteBook(Long id);

    Page<Book> getBookByCategoriesAndPriceRange(List<BookCategory> categories, int min, int max, Pageable pageable);

    Page<Book> getBookByCollectionAndPriceRanges(BookCollection collection,int min, int max,Pageable pageable);
}
