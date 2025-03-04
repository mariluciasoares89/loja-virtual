package mari.lojaVirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mari.lojaVirtual.model.Acesso;


@Repository
@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long>{

	
}
