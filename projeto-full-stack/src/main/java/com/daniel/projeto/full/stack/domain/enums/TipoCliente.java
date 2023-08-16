package com.daniel.projeto.full.stack.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		/*O loop verifica se o código passado (cod) é igual ao código associado a cada valor da enumeração.*/
		for(TipoCliente clientes : TipoCliente.values()) {
			if(cod.equals(clientes.getCod())){ 
				return clientes;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}

/*
 * 1. `public static TipoCliente toEnum(Integer cod)`: Este é um método público e estático que recebe um parâmetro do tipo `Integer` chamado `cod`, que 
 * representa o código do tipo de cliente.
 * 
 * 2. `if (cod == null) { return null; }`: Se o valor `cod` passado como argumento for nulo, o método retorna nulo. Isso é uma precaução para evitar 
 * NullPointerException.
 * 
 * 3. `for (TipoCliente clientes : TipoCliente.values()) { ... }`: Este é um loop que percorre todos os valores da enumeração `TipoCliente` usando o 
 * método `values()`. O loop verifica se o código passado (`cod`) é igual ao código associado a cada valor da enumeração.
 * 
 * 4. `if (cod.equals(clientes.getCod())) { return clientes; }`: Se o código passado for igual ao código associado ao valor da enumeração atualmente 
 * sendo verificado no loop, o método retorna o próprio valor da enumeração (`clientes`).
 * 
 * 5. `throw new IllegalArgumentException("Id inválido: " + cod);`: Se nenhum valor da enumeração corresponder ao código passado, o loop termina e o 
 * método lança uma exceção `IllegalArgumentException`, indicando que o código é inválido e não corresponde a nenhum valor da enumeração.
 * 
 * Em resumo, esse método estático `toEnum` é usado para converter um valor numérico em um valor de uma enumeração `TipoCliente`. Ele percorre todos os 
 * valores da enumeração e compara o código passado com os códigos associados a esses valores. Se encontrar uma correspondência, retorna o valor da 
 * enumeração correspondente; caso contrário, lança uma exceção indicando um código inválido. Isso é útil para converter códigos em tipos mais legíveis 
 * e entender o significado de um valor em uma enumeração.*/
