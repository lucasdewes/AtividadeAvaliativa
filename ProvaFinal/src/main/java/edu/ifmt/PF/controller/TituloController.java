package edu.ifmt.PF.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.ifmt.PF.Titulos;
import edu.ifmt.PF.model.TipoSexo;
import edu.ifmt.PF.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	//public String novo() {
		//return "CadastroTitulo";
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("todosStatusTitulo", TipoSexo.values());
		return mv;
	}
	@ModelAttribute("todosStatusTitulo")
	public List<TipoSexo> todosStatusTitulo(){
		return Arrays.asList(TipoSexo.values());
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
	//public String salvar(Titulo titulo) {
		titulos.save(titulo);
		//return "CadastroTitulo";
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Foi salvo com sucesso!");
		return mv;
		
		
	}
	@RequestMapping	
	public ModelAndView pesquisar() {
		List<Titulo> todosTitulos = titulos.findAll();
		//return "PesquisaTitulos";
		ModelAndView mv= new ModelAndView("PesquisaTitulos");
		mv.addObject("titulos", todosTitulos);
		return mv;
	}
}
