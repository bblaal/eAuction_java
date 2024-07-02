package com.example.eAuction.repository;

import com.example.eAuction.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, String> {
}
