package br.com.alura.mvc.mudi.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/usuario",  method = RequestMethod.POST)
public class CadastroUsuarioController {

	@GetMapping(path = "/usuario/cadastroUsuario")
	public String cadastroUsuario() {
		return "cadastroUsuario";
	}
}
