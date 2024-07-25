package com.example.doolhof.service;

import com.example.doolhof.domeinen.Game;
import com.example.doolhof.domeinen.GameState;
import com.example.doolhof.domeinen.Player;
import com.example.doolhof.exception.NotFoundException;
import com.example.doolhof.repository.GameRepository;
import com.example.doolhof.repository.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class GameService {
    private final GameRepository gameRepository;
    private final PlayerRepository playerRepository;

    public GameService(GameRepository gameRepository, PlayerRepository playerRepository) {
        this.gameRepository = gameRepository;
        this.playerRepository = playerRepository;
    }

    public Optional<Game> getGame(UUID gameId) {
        return gameRepository.findById(gameId);
    }

    // Nog afwerken!
    public Game createGame(UUID player_id) {
        Game game = new Game();
        game.setGameState(GameState.NOT_STARTED);
        Optional<Player> currentPlayer = playerRepository.findById(player_id);
        if (currentPlayer.isEmpty()) {
            throw new NotFoundException("Player does not exist");
        }
        List<Player> players = new ArrayList<>();
        players.add(currentPlayer.get());
        game.setPlayers(players);
        return game;
    }

    public void deleteGame(UUID game_id) {
        Optional<Game> game = gameRepository.findById(game_id);
        if (game.isEmpty()) {
            throw new NotFoundException("Spel is niet gevonden");
        }
        gameRepository.delete(game.get());
    }
}
