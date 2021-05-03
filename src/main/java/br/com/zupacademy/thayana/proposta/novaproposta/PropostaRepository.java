package br.com.zupacademy.thayana.proposta.novaproposta;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository extends JpaRepository<Proposta, Long> {

	Optional<Proposta> findByCpfOuCnpj(String cpfOuCnpj);

}
