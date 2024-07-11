@RestController
@RequestMapping("api/players")
public class PlayerController {
    @GetMapping("/")
    public ResponseEntity<Player> getPlayer() {
        return ResponseEntity.Ok("ok!")
    }
}