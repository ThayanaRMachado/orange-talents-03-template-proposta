package br.com.zupacademy.thayana.proposta.compartilhados.validacao;

public class FieldMessage {

	private String nomeCampo;
	private String mensagem;

	public FieldMessage() {
		
	}

	public FieldMessage(String nomeCampo, String mensagem) {
		this.nomeCampo = nomeCampo;
		this.mensagem = mensagem;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public String getMensagem() {
		return mensagem;
	}

}
