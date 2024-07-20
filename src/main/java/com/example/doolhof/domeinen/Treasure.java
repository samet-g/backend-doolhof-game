package com.example.doolhof.domeinen;
import jakarta.persistence.*;

import java.util.UUID;
//@Entity(name = "Treasures")
@Entity
public class Treasure {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    private String item;
}

