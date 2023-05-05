package practive.practive.services;

import practive.practive.dto.ClubDTO;
import practive.practive.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDTO> findAllClubs();

    Club saveClub(Club club);
}
