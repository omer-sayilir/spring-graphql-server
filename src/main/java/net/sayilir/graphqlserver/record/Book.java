package net.sayilir.graphqlserver.record;


import java.util.*;
/**
 * @author omersayilir
 * @Date 2024-08-22
 */
public record Book(
        String id,
        String name,
        int pageCount,
        String authorId) {
    private static List<Book> books = Arrays.asList(
        new Book ("book-1", "Effective Java", 410, "author-1"),
        new Book ("book-2", "Clean Code", 464, "author-2"),
        new Book ("book-3", "The Pragmatic Programmer", 352, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book->book.id().equals(id)).findFirst().orElse(null);
    }

}
