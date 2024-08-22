package net.sayilir.graphqlserver.controller;

import net.sayilir.graphqlserver.record.Author;
import net.sayilir.graphqlserver.record.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

/**
 * @author omersayilir
 * @Date 2024-08-22
 */
@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id){
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book){
        return Author.getById(book.authorId());
    }

}
