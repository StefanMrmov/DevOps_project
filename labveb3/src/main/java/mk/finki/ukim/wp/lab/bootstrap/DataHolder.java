package mk.finki.ukim.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import jdk.jfr.Category;
import mk.finki.ukim.wp.lab.model.Author;
import mk.finki.ukim.wp.lab.model.Book;
import mk.finki.ukim.wp.lab.model.BookStore;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Author> authors = null;
    public static List<Book> books = null;
    public static List<BookStore> bookStores = null;

//    @PostConstruct
//    public void init() {
//        authors = new ArrayList<>();
//        authors.add(new Author("Emily", "Johnson", "Emily Johnson is a skilled poet with a passion for nature-inspired verses.", LocalDate.of(1980, 5, 15)));
//        authors.add(new Author("William", "Taylor", "William Taylor is a prolific science fiction writer known for his futuristic narratives.", LocalDate.of(1982, 7, 25)));
//        authors.add(new Author("Sophia", "Lee", "Sophia Lee is an adventurous storyteller who weaves tales of mystery and intrigue.", LocalDate.of(1984, 9, 10)));
//        authors.add(new Author("David", "Wong", "David Wong is a humorist and satirical author whose works explore the absurdity of everyday life.", LocalDate.of(1986, 11, 8)));
//        authors.add(new Author("Olivia", "Chen", "Olivia Chen is an emerging voice in contemporary literature, offering fresh perspectives on societal issues.", LocalDate.of(1988, 3, 3)));
//        bookStores = new ArrayList<>();
//        BookStore bookStore1 = new BookStore("Enchanting Reads", "San Diego", "456 Pine Street");
//        BookStore bookStore2 = new BookStore("Epic Adventures", "Miami", "789 Oak Avenue");
//        BookStore bookStore3 = new BookStore("Whimsical Words", "Denver", "101 Cedar Lane");
//        BookStore bookStore4 = new BookStore("Imagination Station", "Portland", "202 Birch Drive");
//        BookStore bookStore5 = new BookStore("Bookish Bliss", "Austin", "303 Maple Road");
//        bookStores.add(bookStore1);
//        bookStores.add(bookStore2);
//        bookStores.add(bookStore3);
//        bookStores.add(bookStore4);
//        bookStores.add(bookStore5);
//        books = new ArrayList<>();
//        books.add(new Book("978-0765326355", "The Enchanted Forest", "Fantasy", 2010, new ArrayList<>(), bookStore1));
//        books.add(new Book("978-0553386790", "Galactic Odyssey", "Science Fiction", 2015, new ArrayList<>(), bookStore2));
//        books.add(new Book("978-0061120084", "Mystic Shadows", "Mystery", 2018, new ArrayList<>(), bookStore3));
//        books.add(new Book("978-0451524935", "Laugh Out Loud Chronicles", "Humor", 2022, new ArrayList<>(), bookStore4));
//        books.add(new Book("978-1980497193", "Voices of Change", "Contemporary", 2021, new ArrayList<>(), bookStore5));
//    }
}
