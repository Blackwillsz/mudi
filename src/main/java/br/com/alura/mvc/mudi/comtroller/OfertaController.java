package br.com.alura.mvc.mudi.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "ofertas", method = RequestMethod.POST)
public class OfertaController {

	@GetMapping
	public String getFormularioParaOferta() {
		return "/oferta/home";
	}
}
