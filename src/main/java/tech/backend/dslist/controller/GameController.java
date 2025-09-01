package tech.backend.dslist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.backend.dslist.controller.dto.GameMinDto;
import tech.backend.dslist.entity.Game;
import tech.backend.dslist.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameMinDto>> findAll() {
        var result = gameService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id) {
        var user = gameService.findById(id);
        return ResponseEntity.ok(user.get());
    }
}
