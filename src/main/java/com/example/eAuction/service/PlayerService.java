package com.example.eAuction.service;

import com.example.eAuction.model.Player;
import com.example.eAuction.repository.PlayerRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    @Resource
    PlayerRepository playerRepository;

    public String addPlayer(Player player){
        String flag = "";
        try {
            playerRepository.save(player);
            flag = "Success";
        }catch (Exception e){
            flag = "Error";
        }finally {
            return flag;
        }

    }

    public Optional<Player> getPlayerById(String playerId){

        return playerRepository.findById(playerId);
    }

    public Iterable<Player> getAllPlayers(){
        return playerRepository.findAll();

    }

}
