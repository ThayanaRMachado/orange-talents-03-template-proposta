package br.com.zupacademy.thayana.proposta.novaproposta;

import java.math.BigDecimal;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import br.com.zupacademy.thayana.proposta.compartilhados.validacao.CpfOuCnpj;

@CpfOuCnpj
public class NovaPropostaRequest {

	@NotBlank
	private String cpfOuCnpj;

	private Integer tipo;	

	@NotBlank
	@Email
	private String email;

	@NotBlank
	private String nome;

	@NotBlank
	private String logradouro;

	@NotBlank
	private String numero;
	private String complemento;

	@NotBlank
	private String bairro;

	@NotBlank
	private String cep;

	@NotBlank
	private String cidade;

	@NotBlank
	private String estado;

	@Positive
	@NotNull
	private BigDecimal salarioBruto;

	public NovaPropostaRequest(@NotBlank String cpfOuCnpj, Integer tipo, @NotBlank @Email String email,
			@NotBlank String nome, @NotBlank String logradouro, @NotBlank String numero, String complemento,
			@NotBlank String bairro, @NotBlank String cep, @NotBlank String cidade, @NotBlank String estado,
			@Positive @NotNull BigDecimal salarioBruto) {
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo;
		this.email = email;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.salarioBruto = salarioBruto;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	
	public Integer getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public BigDecimal getSalarioBruto() {
		return salarioBruto;
	}

	public Proposta converter() {
		return new Proposta(cpfOuCnpj, tipo, email, nome, logradouro, numero, complemento, bairro, cep, cidade, estado, salarioBruto);
	}

}
