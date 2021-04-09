package edu.ifmt.PF.model;


public enum TipoSexo {
	
	MASCULINO("masculino"),
	FEMININO("feminino");
	
	private String descricao;
	TipoSexo(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
