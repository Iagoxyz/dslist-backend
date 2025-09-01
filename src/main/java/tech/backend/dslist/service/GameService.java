package tech.backend.dslist.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.backend.dslist.controller.dto.GameMinDto;
import tech.backend.dslist.entity.Game;
import tech.backend.dslist.repository.GameRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {

        var result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream()
                .map(x -> new GameMinDto(
                        x.getId(),
                        x.getTitle(),
                        x.getYear(),
                        x.getImgUrl(),
                        x.getShortDescription()))
                .toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public Optional<Game> findById(Long id) {
        return gameRepository.findById(id);
    }


}
