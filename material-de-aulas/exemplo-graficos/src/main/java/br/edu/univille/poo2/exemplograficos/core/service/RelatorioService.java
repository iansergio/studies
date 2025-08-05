package br.edu.univille.poo2.exemplograficos.core.service;

import br.edu.univille.poo2.exemplograficos.core.dto.RelatorioDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

@Service
public class RelatorioService {


    public RelatorioDTO relatorioDeLinha() {
        Random random = new Random();
        var dto = new RelatorioDTO();
        dto.setTitulo("Visualizações do Produto");
        dto.setLegenda("Total por dia");
        dto.setXLabel("Dia");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();
        LocalDate startDate = LocalDate.now().withDayOfMonth(1);
        LocalDate endDate = startDate.plusMonths(1);
        while (startDate.isBefore(endDate)){
            labels.add(Integer.toString(startDate.getDayOfMonth()));
            valores.add(Integer.toString(random.nextInt(100)));
            startDate = startDate.plusDays(1);
        }
        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

    public RelatorioDTO relatorioDeBarra() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Precipitação Média em Joinville");
        dto.setLegenda("Total por dia");
        dto.setXLabel("Mês");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("Jun");
        labels.add("Jul");
        labels.add("Aug");
        labels.add("Sep");
        labels.add("Oct");
        labels.add("Nov");
        labels.add("Dec");

        valores.add("266.6");
        valores.add("188");
        valores.add("178.2");
        valores.add("98.3");
        valores.add("99.9");
        valores.add("90.6");
        valores.add("90.1");
        valores.add("112.7");
        valores.add("140.1");
        valores.add("162.4");
        valores.add("146.9");
        valores.add("172.6");

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

    public RelatorioDTO relatorioDePizza() {
        var dto = new RelatorioDTO();
        dto.setTitulo("Vendas de Pizza");
        dto.setLegenda("Total por dia");
        dto.setXLabel("Mês");
        var valores = new ArrayList<String>();
        var labels = new ArrayList<String>();
        labels.add("Quatro Queijos");
        labels.add("Calabresa");
        labels.add("Frango com Catupiry");
        labels.add("Apr");
        labels.add("Portuguesa");
        labels.add("Mussarela");

        valores.add("60");
        valores.add("40");
        valores.add("15");
        valores.add("10");
        valores.add("3");
        valores.add("1");

        dto.setLabels(labels);
        dto.setValores(valores);
        return dto;
    }

}
