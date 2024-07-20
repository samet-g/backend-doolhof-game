package com.example.doolhof.service;

import com.example.doolhof.domeinen.Game;
import com.example.doolhof.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Optional<Game> getGame(UUID gameId) {
        return gameRepository.findById(gameId);
    }
}
