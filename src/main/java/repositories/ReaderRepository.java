package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Reader;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {

}