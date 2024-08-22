
#   Spring Boot GraphQL

    This project is a simple demo application built with Spring Boot and GraphQL. It demonstrates how to create a basic GraphQL API with a schema and resolvers to manage book and author data.

##  Project Structure

	•	Schema Definition: Defines the GraphQL schema including Query, Book, and Author types.

##  Schema

    The GraphQL schema is defined as follows:

```graphql
type Query {
    bookById(id: ID): Book
}

type Book {
    id: ID
    name: String
    pageCount: Int
    author: Author
}

type Author {
    id: ID
    firstName: String
    lastName: String
}
```

	•	Query: Allows querying a book by its ID.
	•	Book: Represents a book with an ID, name, page count, and associated author.
	•	Author: Represents an author with an ID, first name, and last name.

##  GraphQL Playground

    Once the application is running, you can access the GraphQL Playground at:

```graphql
query {
  bookById(id: "1") {
    id
    name
    pageCount
    author {
      id
      firstName
      lastName
    }
  }
}
```

http://localhost:8080/graphiql