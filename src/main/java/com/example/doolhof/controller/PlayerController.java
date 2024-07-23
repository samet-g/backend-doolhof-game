package com.example.doolhof.controller;
import com.example.doolhof.domeinen.Player;
import com.example.doolhof.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{player_Id}")
    public ResponseEntity<Player> getPlayer(@PathVariable UUID player_Id) {
        Player player = playerService.getPlayer(player_Id).orElse(null);
        return ResponseEntity.ok(player);
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }
}
