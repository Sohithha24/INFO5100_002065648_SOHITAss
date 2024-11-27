import com.example.bookshelfparser.BookShelf;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BookParser {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Load the JSON data from a file
            File jsonFile = new File("books.json");

            // Parse the JSON file into a BookShelf object
            BookShelf bookShelf = objectMapper.readValue(jsonFile, BookShelf.class);

            // Print the parsed data
            System.out.println(bookShelf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

