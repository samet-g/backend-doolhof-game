package com.example.doolhof.service;

import com.example.doolhof.domeinen.Player;
import com.example.doolhof.exception.AlreadyExistException;
import com.example.doolhof.exception.NotFoundException;
import com.example.doolhof.repository.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Transactional
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Optional<Player> getPlayer(UUID playerId) {
        return playerRepository.findById(playerId);
    }

    public Player addPlayer(Player player) {
        Player player1 = playerRepository.findByName(player.getName());
        if (!player1.getName().isEmpty())
            throw new AlreadyExistException("Player with name " + player.getName() + " already exists.");
        player.setLoggedIn(true);
        return player;
    }

    public void removePlayer(UUID playerId) {
        Optional<Player> player = playerRepository.findById(playerId);
        if (player.isEmpty()) {
            throw new NotFoundException("Player does not exist");
        }
    }

    public void updatePlayer(Player newPlayer) {
        Optional<Player> currentPlayer = playerRepository.findById(newPlayer.getId());
        if (currentPlayer.isEmpty()) {
            throw new NotFoundException("Player does not exist");
        }
        currentPlayer.get().setName(newPlayer.getName());
    }
}
