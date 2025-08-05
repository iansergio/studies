package br.edu.univille.poo2.exemplograficos.controller;

import br.edu.univille.poo2.exemplograficos.core.dto.RelatorioDTO;
import br.edu.univille.poo2.exemplograficos.core.service.RelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/linha")
    public ModelAndView linha(){
        var mv = new ModelAndView("relatorio/linha");
        RelatorioDTO relatorioDTO = relatorioService.relatorioDeLinha();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

    @GetMapping("/barra")
    public ModelAndView barra(){
        var mv = new ModelAndView("relatorio/barra");
        RelatorioDTO relatorioDTO = relatorioService.relatorioDeBarra();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }

    @GetMapping("/pizza")
    public ModelAndView pizza(){
        var mv = new ModelAndView("relatorio/pizza");
        RelatorioDTO relatorioDTO = relatorioService.relatorioDePizza();
        mv.addObject("relatorio", relatorioDTO);
        return mv;
    }
    
}
