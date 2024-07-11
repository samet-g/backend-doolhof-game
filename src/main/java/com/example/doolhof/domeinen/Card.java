@Entity(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @OneToOne()
    private Treasure treasure;     // item (schat object)

    public Treasure getTreasure(){
        return this.treasure;
    }

    public void setTreasure(treasure){
        this.treasure = treasure
    }
}
