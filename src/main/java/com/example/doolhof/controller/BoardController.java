@RestController
@RequestMapping("api/boards")
public class BoardController {
    @GetMapping("/")
    public ResponseEntity<Player> getBoard() {
        return ResponseEntity.Ok("ok!")
    }
}
