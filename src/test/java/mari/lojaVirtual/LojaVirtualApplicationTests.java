package mari.lojaVirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mari.lojaVirtual.controller.AcessoController;
import mari.lojaVirtual.model.Acesso;
import mari.lojaVirtual.repository.AcessoRepository;
import mari.lojaVirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualApplication.class)
public class LojaVirtualApplicationTests {

	//@Autowired
	//private AcessoRepository acessoRepository;
	
	@Autowired
	private AcessoController acessoController;	
	
	@Autowired
	private AcessoService acessoService;
	
	
	@Test
	public void testeCadastraAcesso() {
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.salvarAcesso(acesso);
		
		
		
	}

}
