package mk.finki.ukim.wp.lab.repository.jpa;

import mk.finki.ukim.wp.lab.model.Book;
import mk.finki.ukim.wp.lab.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {


    List<Review> findReviewByTimestampBetweenAndBook(LocalDateTime from, LocalDateTime to, Book book);

    List<Review> findAllByBook(Book book);
}
