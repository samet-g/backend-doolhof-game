package com.example.doolhof.repository;

import com.example.doolhof.domeinen.Player;
import com.example.doolhof.domeinen.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TileRepository extends JpaRepository<Tile, UUID> {
}
