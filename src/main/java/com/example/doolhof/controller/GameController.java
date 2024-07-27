package com.example.doolhof.controller;

import com.example.doolhof.domeinen.Game;
import com.example.doolhof.domeinen.GameState;
import com.example.doolhof.exception.NotFoundException;
import com.example.doolhof.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("")
    public ResponseEntity<String> getGame() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/{game_id}")
    public ResponseEntity<Game> getGame(@PathVariable UUID game_id) {
        Game game = gameService.getGame(game_id).orElse(null);
        return ResponseEntity.ok(game);
    }

    @PostMapping("/{player_id}")
    public ResponseEntity<Game> createGame(@PathVariable UUID player_id){
        Game game = gameService.createGame(player_id);

        return ResponseEntity.ok(game);
    }

    @DeleteMapping("/{game_id}")
    public ResponseEntity<Void> deleteGame(@PathVariable UUID game_id){
        try{
            gameService.deleteGame(game_id);
        }catch (NotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
