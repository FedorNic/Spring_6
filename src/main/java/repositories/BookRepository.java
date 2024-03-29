package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Book;

/**
 * Класс описывает взаимодействие с хранилищем книг
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}