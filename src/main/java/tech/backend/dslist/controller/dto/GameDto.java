package tech.backend.dslist.controller.dto;

public record GameDto(Long id,
                         String title,
                         Integer year,
                         String genre,
                         Double score,
                         String imgUrl,
                         String shortDescription,
                         String longDescription){
}
