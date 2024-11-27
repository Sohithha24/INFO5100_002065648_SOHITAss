package com.example.bookshelfparser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Create initial data
            Book book1 = new Book();
            book1.setTitle("Java Programming");
            book1.setPublishedYear(2020);
            book1.setNumberOfPages(500);
            book1.setAuthors(Arrays.asList("Author A", "Author B"));

            Book book2 = new Book();
            book2.setTitle("Python Essentials");
            book2.setPublishedYear(2018);
            book2.setNumberOfPages(350);
            book2.setAuthors(Arrays.asList("Author C"));

            Book book3 = new Book();
            book3.setTitle("Data Structures");
            book3.setPublishedYear(2022);
            book3.setNumberOfPages(400);
            book3.setAuthors(Arrays.asList("Author D", "Author E"));

            BookShelf bookShelf = new BookShelf();
            bookShelf.setBooks(new ArrayList<>(Arrays.asList(book1, book2, book3)));

            // Serialize and deserialize using JSON
            serializeToJson(bookShelf);
            deserializeFromJson();

            // Serialize and deserialize using XML
            serializeToXml(bookShelf);
            deserializeFromXml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serializeToJson(BookShelf bookShelf) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("bookshelf.json");
        objectMapper.writeValue(jsonFile, bookShelf);
        System.out.println("Serialized JSON: " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookShelf));
    }

    private static void deserializeFromJson() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("bookshelf.json");
        BookShelf bookShelf = objectMapper.readValue(jsonFile, BookShelf.class);
        System.out.println("Deserialized JSON: " + bookShelf);
    }

    private static void serializeToXml(BookShelf bookShelf) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("bookshelf.xml");
        xmlMapper.writeValue(xmlFile, bookShelf);
        System.out.println("Serialized XML: " + xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookShelf));
    }

    private static void deserializeFromXml() throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("bookshelf.xml");
        BookShelf bookShelf = xmlMapper.readValue(xmlFile, BookShelf.class);
        System.out.println("Deserialized XML: " + bookShelf);
    }
}

