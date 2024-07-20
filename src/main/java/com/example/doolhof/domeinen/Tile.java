package com.example.doolhof.domeinen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.UUID;

@Entity(name = "tiles")
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private Treasure treasure; // item (schat? ja/nee object)

    private int direction;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "game_id", nullable = true)
    Game game;

    private boolean isWallLeft;

    private boolean isWallLRight;

    private boolean isWallLTop;

    private boolean isWallLBottom;

    private int positionX;
    private int positionY;

    @Enumerated(EnumType.STRING)
    private Path path;



    public Tile(){}

    public Tile(Path path){
        this.treasure = null;
        this.path = path;
        direction = 0;
        configureTileSides(path, direction); // default at initial
    }

    public Tile(Path path, Treasure treasure){
        this.treasure = treasure;
        this.path = path;
        direction = 0;
        configureTileSides(path, direction);
    }

    public Tile(Path path, Treasure treasure, int direction){
        this.treasure = treasure;
        this.path = path;
        this.direction = direction;
        configureTileSides(path, direction);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    //    configureTileSides(path); // default at initial
    //}


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isWallLeft() {
        return isWallLeft;
    }

    public void setWallLeft(boolean wallLeft) {
        isWallLeft = wallLeft;
    }

    public boolean isWallLRight() {
        return isWallLRight;
    }

    public void setWallLRight(boolean wallLRight) {
        isWallLRight = wallLRight;
    }

    public boolean isWallLBottom() {
        return isWallLBottom;
    }

    public void setWallLBottom(boolean wallLBottom) {
        isWallLBottom = wallLBottom;
    }

    public boolean isWallLTop() {
        return isWallLTop;
    }

    public void setWallLTop(boolean wallLTop) {
        isWallLTop = wallLTop;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // DEFAULT position of path / roads
    private void configureTileSides(Path path, int direction) {
        switch (path) {
            case STRAIGHT:
                this.isWallLeft = false; // muur
                this.isWallLRight = false; // muur
                this.isWallLTop = true; // doorgang
                this.isWallLBottom = true; // doorgang
                break;
            case CORNER:
                this.isWallLeft = true;
                this.isWallLRight = false;
                this.isWallLTop = true;
                this.isWallLBottom = false;
                break;
            case CROSSPOINT:
                this.isWallLeft = true;
                this.isWallLRight = false;
                this.isWallLTop = true;
                this.isWallLBottom = true;
                break;
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
