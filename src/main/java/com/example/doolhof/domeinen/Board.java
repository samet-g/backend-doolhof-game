@Entity(name = "boards")
public class Board {
    @OneToOne
    private Tile[][] tiles;

    public Tile[][] getTIles(){
        return this.tiles;
    }

    public void setTiles(Tile[][] tiles){
        this.tiles = tiles;
    }

}