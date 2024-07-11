@Entity(name = "tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private Treasure treasure; // item (schat? ja/nee object)
    private boolean left;

    private boolean right;

    private boolean top;

    private boolean bottom;

    @Enumerated(EnumType.STRING)
    private Path path;

    // Tile dicrection (tegel richting)
    
    public Tile(Path path){
        this.treasure = null;
        this.path = path;
        configureTileSides(path); // default at initial
    }

    public Tile(Path path, Treasure treasure){
        this.treasure = treasure;
        this.path = path;
        configureTileSides(path); // default at initial
    }


    // DEFAULT position of path / roads
    private void configureTileSides(Path path) {
        switch (path) {
            case STRAIGHT:
                this.left = false; // muur
                this.right = false; // muur
                this.top = true; // doorgang
                this.bottom = true; // doorgang
                break;
            case CORNER:
                this.left = true;
                this.right = false;
                this.top = true;
                this.bottom = false;
                break;
            case CROSSPOINT:
                this.left = true;
                this.right = false;
                this.top = true;
                this.bottom = true;
                break;
        }
    }
}
