package com.example.doolhof.domeinen;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // één game heeft meerdere spelers
    private List<Player> players;

    // één game heeft één bord
    @OneToOne(cascade = CascadeType.ALL)
    private Board board;


    @Enumerated(EnumType.STRING)
    private GameState gamestate;

    // één game heeft meerdere kaarten
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Card> cards;


    // één game heeft meerdere tegels
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tile> tiles;


    // één game heeft één speler aan de beurt
    // speler aan de beurt
    @OneToOne
    private Player currentPlayer;

    // Board  -> tiles

    public Game() {
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

   public Player getCurrentPlayer(){
        return this.currentPlayer;
    }
    public void setCurrentPlayer(Player currentPlayer){
        this.currentPlayer = currentPlayer;
    }


    public List<Tile> getTiles(){
        return this.tiles;
    }

    public void setTiles(List<Tile> Tiles){
        this.tiles = tiles;
    }



    public Board getBoard(){
        return this.board;
    }

    // is dit nodig? nog te bekijken
    public void setBoard(Board board){
        this.board = board;
    }

    public GameState getGameState(){
        return this.gamestate;
    }
    public void setGameState(GameState gamestate){
        this.gamestate = gamestate;
    }

    public List<Card> getCards(){
        return this.cards;
    }
    public void setCards(List<Card> cards){
        this.cards = cards;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }


}
