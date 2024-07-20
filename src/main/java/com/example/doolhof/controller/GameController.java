package com.example.doolhof.controller;

import com.example.doolhof.domeinen.Game;
import com.example.doolhof.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
