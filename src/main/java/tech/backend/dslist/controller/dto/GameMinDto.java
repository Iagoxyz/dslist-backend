package tech.backend.dslist.controller.dto;

import tech.backend.dslist.projections.GameMinProjection;

public record GameMinDto(Long id,
                         String title,
                         Integer year,
                         String imgUrl,
                         String shortDescription) {

    public static GameMinDto fromProjection(GameMinProjection projection) {
        return new GameMinDto(
                projection.getId(),
                projection.getTitle(),
                projection.getYear(),
                projection.getImgUrl(),
                projection.getShortDescription()
        );
    }
}
