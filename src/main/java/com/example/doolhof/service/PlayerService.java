package com.example.doolhof.service;

import com.example.doolhof.domeinen.Player;
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
}