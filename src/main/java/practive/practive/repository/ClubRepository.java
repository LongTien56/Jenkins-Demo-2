package practive.practive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practive.practive.models.Club;

import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
}
