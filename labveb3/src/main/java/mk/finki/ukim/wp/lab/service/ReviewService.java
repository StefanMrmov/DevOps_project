package mk.finki.ukim.wp.lab.service;

import mk.finki.ukim.wp.lab.model.Book;
import mk.finki.ukim.wp.lab.model.Review;

import java.time.LocalDateTime;
import java.util.List;

public interface ReviewService {

    void save(Review review);

    List<Review> findReviewByTimestampBetweenAndBook(LocalDateTime from, LocalDateTime to, Book book);

    List<Review> findAllReviewsByBook(Book book);
}
