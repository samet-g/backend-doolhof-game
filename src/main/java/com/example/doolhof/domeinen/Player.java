@Entity(name = "players")
public class Player {
    private Game game;
    private List<Card> cards;
    private Card current_objective; // schat die hij/zij moet zoeken
    private Tile tile; // 1 tegel per speler
    private UUID id;
    private String name;
    private int positionX;
    private int positionY;
    // current card  )-> schat die we zoeken
    // 
}
