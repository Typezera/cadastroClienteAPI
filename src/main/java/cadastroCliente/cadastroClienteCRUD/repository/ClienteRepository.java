package cadastroCliente.cadastroClienteCRUD.repository;

import cadastroCliente.cadastroClienteCRUD.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
