package com.filipefbf.fbflist.repositories;

import com.filipefbf.fbflist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
