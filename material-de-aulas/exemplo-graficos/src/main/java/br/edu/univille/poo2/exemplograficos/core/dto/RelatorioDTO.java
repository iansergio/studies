package br.edu.univille.poo2.exemplograficos.core.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class RelatorioDTO {
    private String titulo;
    private String legenda;
    private String xLabel;
    private String yLabel;
    private List<String> labels;
    private List<String> valores;
    private List<String> cores;
}
