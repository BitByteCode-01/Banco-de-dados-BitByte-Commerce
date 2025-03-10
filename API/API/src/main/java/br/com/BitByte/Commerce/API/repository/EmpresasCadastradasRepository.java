package br.com.BitByte.Commerce.API.repository;


import br.com.BitByte.Commerce.API.models.EmpresasCadastradas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresasCadastradasRepository extends JpaRepository<EmpresasCadastradas, Long> {
}
