package com.daniel.projeto.full.stack.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"), 
	QUITADO(2, "Quitado"), 
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;

	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		/*O loop verifica se o código passado (cod) é igual ao código associado a cada valor da enumeração.*/
		for(EstadoPagamento estPagamento : EstadoPagamento.values()) {
			if(cod.equals(estPagamento.getCod())){ 
				return estPagamento;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
