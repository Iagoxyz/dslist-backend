package tech.backend.dslist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.backend.dslist.controller.dto.GameListDto;
import tech.backend.dslist.service.GameListService;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDto>> findAll() {
        var game = gameListService.findAll();
        return ResponseEntity.ok(game);
    }
}
