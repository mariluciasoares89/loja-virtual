package mari.lojaVirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mari.lojaVirtual.model.Acesso;
import mari.lojaVirtual.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;

	public Acesso save(Acesso acesso) {
		
		/*Qualquer tipo de validação*/
		return acessoRepository.save(acesso);
	}
}
