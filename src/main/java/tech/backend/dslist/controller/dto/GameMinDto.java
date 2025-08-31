package tech.backend.dslist.controller.dto;

public record GameMinDto(Long id,
                         String title,
                         Integer year,
                         String imgUrl,
                         String shortDescription) {

}
