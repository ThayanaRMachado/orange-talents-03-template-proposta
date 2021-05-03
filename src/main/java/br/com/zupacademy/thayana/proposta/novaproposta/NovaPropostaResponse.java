package br.com.zupacademy.thayana.proposta.novaproposta;

import java.math.BigDecimal;

public class NovaPropostaResponse {

	private Long id;
	private String cpfOuCnpj;
	private Integer tipo;
	private String email;
	private String nome;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private BigDecimal salarioBruto;

	public NovaPropostaResponse(Proposta proposta) {
		this.id = proposta.getId();
		this.cpfOuCnpj = proposta.getCpfOuCnpj();
		this.tipo = proposta.getTipo();
		this.email = proposta.getEmail();
		this.nome = proposta.getNome();
		this.logradouro = proposta.getLogradouro();
		this.numero = proposta.getNumero();
		this.complemento = proposta.getComplemento();
		this.bairro = proposta.getBairro();
		this.cep = proposta.getCep();
		this.cidade = proposta.getCidade();
		this.estado = proposta.getEstado();
		this.salarioBruto = proposta.getSalarioBruto();
	}

	public Long getId() {
		return id;
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

}
