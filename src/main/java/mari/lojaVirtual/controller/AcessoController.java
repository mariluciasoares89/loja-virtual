package mari.lojaVirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mari.lojaVirtual.model.Acesso;
import mari.lojaVirtual.repository.AcessoRepository;
import mari.lojaVirtual.service.AcessoService;


@Controller
@RestController
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	@ResponseBody /*Poder dar um retorno da API*/ 
	@PostMapping(value = "/salvarAcesso")/*Mapeando a URL para receber um JSON*/
	public ResponseEntity<Acesso>salvarAcesso(@RequestBody Acesso acesso) { /*Recebe o JSON e converte pra Objeto*/
		
		Acesso acessoSalvo = acessoService.save(acesso);
		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
	}
	@ResponseBody /*Poder dar um retorno da API*/ 
	@PostMapping(value = "/deleteAcesso")/*Mapeando a URL para receber um JSON*/
	public ResponseEntity<Acesso>deleteAcesso(@RequestBody Acesso acesso) { /*Recebe o JSON e converte pra Objeto*/
		
		 acessoRepository.deleteById(acesso.getId());
		return new ResponseEntity("acesso removido", HttpStatus.OK);
	}
}
