//package com.example.doolhof.domeinen;
//
//import com.example.doolhof.domeinen.Tile;
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@Entity(name = "boards")
//public class Board {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private UUID id;
//
//    @OneToMany
//    private List<Tile> tiles;
//
//    public List<Tile> getTIles(){
//        return this.tiles;
//    }
//
//    public void setTiles(List<Tile> tiles){
//        this.tiles = tiles;
//    }
//
//}