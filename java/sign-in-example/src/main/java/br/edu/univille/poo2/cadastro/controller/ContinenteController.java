package br.edu.univille.poo2.cadastro.controller;

import br.edu.univille.poo2.cadastro.entity.Continente;
import br.edu.univille.poo2.cadastro.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/continente")
public class ContinenteController {

    @Autowired
    private ContinenteService service;

    @GetMapping
    public ModelAndView index(){
        var mv = new ModelAndView("continente/index");
        mv.addObject("lista", service.obterTodos());
        return mv;
    }

    @GetMapping
    @RequestMapping("/novo")
    public ModelAndView novo(){
        var mv = new ModelAndView("continente/novo");
        mv.addObject("elemento",new Continente());
        return mv;
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ModelAndView editar(@PathVariable long id){
        var mv = new ModelAndView("continente/editar");
        var opt = service.obterPeloId(id);
        if(opt.isPresent()) {
            mv.addObject("elemento", opt.get());
            return mv;
        }
        return new ModelAndView("redirect:/continente");
    }

    @GetMapping
    @RequestMapping("/{id}/excluir")
    public ModelAndView excluir(@PathVariable long id){
        var mv = new ModelAndView("continente/editar");
        var opt = service.obterPeloId(id);
        if(opt.isPresent()) {
            service.excluir(opt.get());
        }
        return new ModelAndView("redirect:/continente");
    }

    @PostMapping
    @RequestMapping("/salvar")
    public ModelAndView salvarNovo(@ModelAttribute("elemento") Continente continente){
        try{
            service.salvar(continente);
            return new ModelAndView("redirect:/continente");
        }catch (Exception e){
            var mv = new ModelAndView("continente/novo");
            mv.addObject("elemento",continente);
            mv.addObject("erro",e.getMessage());
            return mv;
        }
    }

}
