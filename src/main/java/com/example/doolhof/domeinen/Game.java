@Entity(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    // één game heeft één bord
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "board_id", referencedColumnName = "id")
    private Board board;
    @Enumerated(EnumType.STRING)
    private GameState gamestate;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // één game heeft meerdere kaarten
    private List<Card> cards;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // één game heeft meerdere tegels
    private List<Tile> tiles;
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // één game heeft meerdere spelers
    private List<Player> players;

    @OneToOne
    // één game heeft één speler aan de beurt
    @JoinColumn(name = "current_player_id", referencedColumnName = "id")
    private Player currentPlayer; // speler aan de beurt
    // Board  -> tiles

    public List<Player> getPlayers(){
        return this.players
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }

    public Player getCurrentPlayer(){
        return this.currentPlayer;
    }
    public void setCurrentPlayer(Player currentPlayer){
        this.currentPlayer = currentPlayer;
    }

    public UUID getId(){
        return this.id
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Tiles getTiles(){
        return this.tiles
    }

    public void setTiles(List<Tiles> Tiles){
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
        return this.cards
    }
    public void setCards(List<Card> cards){
        this.cards = cards;
    }


}
