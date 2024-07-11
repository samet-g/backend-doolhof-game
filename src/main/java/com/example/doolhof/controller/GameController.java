@RestController
@RequestMapping("api/games")
public class GameController {
    
    @GetMapping("/")
    public ResponseEntity<Game> getGame() {
        return ResponseEntity.Ok("ok!")
    }
}
