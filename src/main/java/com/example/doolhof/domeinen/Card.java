@Entity(name = "cards")
public class Card {
    private UUID id;
    private Treasure treasure;     // item (schat object)
}
