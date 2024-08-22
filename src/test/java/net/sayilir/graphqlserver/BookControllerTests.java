package net.sayilir.graphqlserver;

import net.sayilir.graphqlserver.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;
/**
 * @author omersayilir
 * @Date 2024-08-22
 */
@GraphQlTest(BookController.class)
public class BookControllerTests {
    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shoudldGetFirstBook() {
        this.graphQlTester
                .documentName("bookDetails")
                .variable("id","book-1")
                .execute()
                .path("bookById")
                .matchesJson("""
                        { 
                            id: "book-1",
                            name: "Effective Java", 
                            pageCount: 410,
                            author: {
                                firstName: "John",
                                lastName: "Doe"
                                    }
                        }
                        """);

    }


}
