package mk.finki.ukim.wp.lab.service;

import jakarta.transaction.Transactional;
import mk.finki.ukim.wp.lab.model.BookStore;

import java.util.List;

public interface BookStoreService {
    public List<BookStore> findAll();
    public BookStore findById(Long id);

    void transferInMemoryToDataBase();
}
