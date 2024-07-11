@Entity(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // één speler heeft meerdere kaarten
    private List<Card> cards;
    @OneToOne
    private Card current_objective; // schat die hij/zij moet zoeken
    @OneToOne
    private Tile tile; // 1 tegel per speler

    private String name;
    private int positionX;
    private int positionY;
    // current card  )-> schat die we zoeken
    // 
}
