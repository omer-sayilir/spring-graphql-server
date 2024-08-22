package net.sayilir.graphqlserver.record;
import java.util.*;
/**
 * @author omersayilir
 * @Date 2024-08-22
 */
public record Author(
        String id,
        String firstName,
        String lastName) {
    public static List<Author> authors=Arrays.asList(
        new Author("author-1","John","Doe"),
        new Author("author-2","Jane","Doe"),
        new Author("author-3","John","Smith"));

    public static Author getById(String id){
        return authors.stream().filter(author->author.id().equals(id)).findFirst().orElse(null);
    }
}
