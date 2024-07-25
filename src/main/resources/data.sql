--INSERT INTO games(id)
--VALUES ('f47ac10b-58cc-4372-a567-0e02b2c3d471');

--INSERT INTO players (id, name, game_id)
--VALUES ('f47ac10b-58cc-4372-a567-0e02b2c3d479', 'John Doe', 'f47ac10b-58cc-4372-a567-0e02b2c3d471');


-- Insert into Board
INSERT INTO boards (id)
VALUES ('b3b8f4e8-6b5f-11ec-90d6-0242ac120003');
INSERT INTO boards (id)
VALUES ('a1b2c3d4-6b5f-11ec-90d6-0242ac120004');

-- Insert into Treasure
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120003', 'Bezem');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120004', 'Zak Goud');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120005', 'Schip');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120006', 'Sleutel');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120007', 'Kroon');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120008', 'Drankje');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120009', 'Geest');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120010', 'Schijf (Amulet)');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120011', 'Ring');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120012', 'Buidel');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120013', 'Kaars');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120014', 'Helm');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120015', 'Zwaard');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120016', 'Schatkist');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120017', 'Uil');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120018', 'Spin');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120019', 'Vleermuis');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120020', 'Rat');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120021', 'Kabouter');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120022', 'Boek');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120023', 'Ketting');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120024', 'Vogel');


-- Insert into Tile
INSERT INTO tiles (id, path, is_wall_left, is_wall_l_right, is_wall_l_top, is_wall_l_bottom, position_x, position_y,
                   board_id, game_id, treasure_id)
VALUES ('c3d1b7c4-6b5f-11ec-90d6-0242ac120003', 'STRAIGHT', FALSE, FALSE, TRUE, TRUE, 0, 0,
        'b3b8f4e8-6b5f-11ec-90d6-0242ac120003', NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120003');
INSERT INTO tiles (id, path, is_wall_left, is_wall_l_right, is_wall_l_top, is_wall_l_bottom, position_x, position_y,
                   board_id, game_id, treasure_id)
VALUES ('d4e5f6a7-6b5f-11ec-90d6-0242ac120004', 'CORNER', TRUE, FALSE, TRUE, FALSE, 1, 1,
        'a1b2c3d4-6b5f-11ec-90d6-0242ac120004', NULL, 'e6e7e8e9-6b5f-11ec-90d6-0242ac120004');

-- Insert into Game
INSERT INTO games (id, gamestate, board_id, current_player_id)
VALUES ('f7c9b2f6-6b5f-11ec-90d6-0242ac120003', 'NOT_STARTED', 'b3b8f4e8-6b5f-11ec-90d6-0242ac120003', NULL);
INSERT INTO games (id, gamestate, board_id, current_player_id)
VALUES ('a2b3c4d5-6b5f-11ec-90d6-0242ac120004', 'STARTED', 'a1b2c3d4-6b5f-11ec-90d6-0242ac120004', NULL);

-- Insert into Player
INSERT INTO players (id, name, is_logged_in, position_x, position_y, game_id, tile_id, current_objective_id)
VALUES ('e6e1c1b8-6b5f-11ec-90d6-0242ac120003', 'Player 1', TRUE, 1, 1, 'f7c9b2f6-6b5f-11ec-90d6-0242ac120003',
        'c3d1b7c4-6b5f-11ec-90d6-0242ac120003', NULL);
INSERT INTO players (id, name, is_logged_in, position_x, position_y, game_id, tile_id, current_objective_id)
VALUES ('f8f9a0b1-6b5f-11ec-90d6-0242ac120004', 'Player 2', FALSE, 2, 2, 'a2b3c4d5-6b5f-11ec-90d6-0242ac120004',
        'd4e5f6a7-6b5f-11ec-90d6-0242ac120004', NULL);

-- Insert into Card
INSERT INTO cards (id, game_id, player_id, treasure_id)
VALUES ('d8e9a7d4-6b5f-11ec-90d6-0242ac120003', 'f7c9b2f6-6b5f-11ec-90d6-0242ac120003',
        'e6e1c1b8-6b5f-11ec-90d6-0242ac120003', 'd5a7b8b0-6b5f-11ec-90d6-0242ac120003');
INSERT INTO cards (id, game_id, player_id, treasure_id)
VALUES ('e7e8e9f0-6b5f-11ec-90d6-0242ac120004', 'a2b3c4d5-6b5f-11ec-90d6-0242ac120004',
        'f8f9a0b1-6b5f-11ec-90d6-0242ac120004', 'e6e7e8e9-6b5f-11ec-90d6-0242ac120004');


INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120003', 'Bezem');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120004', 'Zak Goud');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120005', 'Schip');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120006', 'Sleutel');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120007', 'Kroon');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120008', 'Drankje');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120009', 'Geest');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120010', 'Schijf (Amulet)');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120011', 'Ring');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120012', 'Buidel');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120013', 'Kaars');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120014', 'Helm');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120015', 'Zwaard');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120016', 'Schatkist');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120017', 'Uil');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120018', 'Spin');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120019', 'Vleermuis');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120020', 'Rat');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120021', 'Kabouter');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120022', 'Boek');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120023', 'Ketting');
INSERT INTO treasures (id, item)
VALUES ('d5a7b8b0-6b5f-11ec-90d6-0242ac120024', 'Vogel');


-- Invoegen van 20 CORNER tegels
INSERT INTO tiles (id, path, is_wall_left, is_wall_l_right, is_wall_l_top, is_wall_l_bottom, position_x, position_y,
                   board_id, game_id, treasure_id)
VALUES (UUID(), 'CORNER', true, false, true, false, 0, 0, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, false, true, 0, 7, NULL, NULL, NULL),
       (UUID(), 'CORNER', false, true, true, false, 7, 0, NULL, NULL, NULL),
       (UUID(), 'CORNER', false, true, false, true, 7, 7, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CORNER', true, false, true, false, NULL, NULL, NULL, NULL, NULL),

-- Invoegen van 12 STRAIGHT tegels
INSERT INTO tiles (id, path, is_wall_left, is_wall_l_right, is_wall_l_top, is_wall_l_bottom, position_x, position_y,
                   board_id, game_id, treasure_id)
VALUES
    (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL), (UUID(), 'STRAIGHT', false, false, true, true, NULL, NULL, NULL, NULL, NULL);

-- Invoegen van 18 CROSSPOINT tegels
INSERT INTO tiles (id, path, is_wall_left, is_wall_l_right, is_wall_l_top, is_wall_l_bottom, position_x, position_y,
                   board_id, game_id, treasure_id)
VALUES (UUID(), 'CROSSPOINT', false, false, true, false, 2, 0, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120003'),
       (UUID(), 'CROSSPOINT', false, false, true, false, 4, 0, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120004'),
       (UUID(), 'CROSSPOINT', true, false, false, false, 0, 2, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120005'),
       (UUID(), 'CROSSPOINT', true, false, false, false, 2, 2, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120006'),
       (UUID(), 'CROSSPOINT', false, false, true, false, 4, 2, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120007'),
       (UUID(), 'CROSSPOINT', false, true, false, false, 6, 2, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120008'),
       (UUID(), 'CROSSPOINT', true, false, false, false, 2, 4, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120009'),
       (UUID(), 'CROSSPOINT', false, false, true, false, 4, 4, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120010'),
       (UUID(), 'CROSSPOINT', false, true, false, false, 6, 4, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120011'),
       (UUID(), 'CROSSPOINT', false, false, false, true, 2, 6, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120012'),
       (UUID(), 'CROSSPOINT', false, false, false, true, 4, 6, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120013'),
       (UUID(), 'CROSSPOINT', true, false, false, false, 0, 4, NULL, NULL, 'd5a7b8b0-6b5f-11ec-90d6-0242ac120014'),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL),
       (UUID(), 'CROSSPOINT', true, false, true, true, NULL, NULL, NULL, NULL, NULL);