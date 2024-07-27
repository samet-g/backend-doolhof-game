package com.example.doolhof.domeinen;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "Treasures")
public class Treasure {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String item;

    public Treasure() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

