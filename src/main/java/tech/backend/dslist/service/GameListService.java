package tech.backend.dslist.service;

import org.springframework.stereotype.Service;
import tech.backend.dslist.controller.dto.GameListDto;
import tech.backend.dslist.entity.GameList;
import tech.backend.dslist.repository.GameListRepository;
import tech.backend.dslist.repository.GameRepository;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDto> findAll() {

        var result = gameListRepository.findAll();

        List<GameListDto> list = result.stream()
                .map(x -> new GameListDto(
                        x.getId(),
                        x.getName()))
                .toList();

        return list;
    }
}
