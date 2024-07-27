package com.example.doolhof.service;

import com.example.doolhof.domeinen.*;
import com.example.doolhof.exception.NotFoundException;
import com.example.doolhof.repository.CardRepository;
import com.example.doolhof.repository.GameRepository;
import com.example.doolhof.repository.PlayerRepository;
import com.example.doolhof.repository.TileRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Transactional
public class GameService {
    private final GameRepository gameRepository;
    private final PlayerRepository playerRepository;
    private final CardRepository cardRepository;
    private final TileRepository tileRepository;

    public GameService(GameRepository gameRepository, PlayerRepository playerRepository, CardRepository cardRepository, TileRepository tileRepository) {
        this.gameRepository = gameRepository;
        this.playerRepository = playerRepository;
        this.cardRepository = cardRepository;
        this.tileRepository = tileRepository;
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

        List<Tile> tilelist = tileRepository.findAll();
        Set<Tile> tiles = new HashSet<>(tilelist);

        game.setTiles(tiles);


        List<Player> players = new ArrayList<>();
        players.add(currentPlayer.get());
        game.setPlayers(players);
        List<Card> cardList = cardRepository.findAll();
        Set<Card> cards = new HashSet<>(cardList);

        game.setCards(cards);

        game = gameRepository.save(game);

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
