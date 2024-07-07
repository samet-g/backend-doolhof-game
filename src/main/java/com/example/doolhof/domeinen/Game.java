@Entity(name = "games")
public class Game {
    private UUID id;
    private Board board;
    private GameState gamestate;
    private List<Card> cards;
    private List<Tile> tiles;
    private List<Player> players;
    private Player currentPlayer; // speler aan de beurt
    // Board  -> tiles
}
