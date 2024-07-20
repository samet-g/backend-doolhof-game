//package com.example.doolhof.domeinen;
//
//
//import jakarta.persistence.*;
//
//import java.util.UUID;
//
//@Entity(name = "cards")
//public class Card {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private UUID id;
//    @OneToOne()
//    private Treasure treasure;     // item (schat object)
//
//    public Card() {}
//
//    public Treasure getTreasure(){
//        return this.treasure;
//    }
//
//    public void setTreasure(Treasure treasure){
//        this.treasure = treasure;
//    }
//}
