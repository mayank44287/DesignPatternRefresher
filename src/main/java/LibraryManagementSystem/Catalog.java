package LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;

    public List<Book> searchByTitle(String query) {
        // definition
    }
    public List<Book> searchByAuthor(String query) {
        // definition
    }
    public List<Book> searchBySubject(String query) {
        // definition
    }

    @Override
    public List<Book> searchByPublicationDate(Date publishDate) {
        return null;
    }
}
