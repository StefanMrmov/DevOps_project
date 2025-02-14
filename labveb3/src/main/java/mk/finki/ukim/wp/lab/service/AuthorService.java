package mk.finki.ukim.wp.lab.service;

import jakarta.transaction.Transactional;
import mk.finki.ukim.wp.lab.model.Author;

import java.util.List;

public interface AuthorService{
    List<Author> listAuthors();
    Author findById(Long id);
    void deleteById(Long id);

    void transferInMemoryToDataBase();
}