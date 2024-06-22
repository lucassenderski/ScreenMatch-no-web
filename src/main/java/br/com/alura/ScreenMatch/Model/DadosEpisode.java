package br.com.alura.ScreenMatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisode(@JsonAlias("Title") String titulo,
                         @JsonAlias("Episode") Integer numeroEpisode,
                         @JsonAlias("imdbRating") String avaliacao) {
}