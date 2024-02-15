package LibraryManagementSystem;

import java.util.List;

public abstract class Book {
    private String isbn;
    private String title;
    private String subject;
    private String publisher;
    private String languages;
    private int numberOfPages;
    private BookFormat bookFormat;
    private List<Authors> authors;
}
