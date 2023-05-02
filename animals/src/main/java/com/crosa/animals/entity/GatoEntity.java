package com.crosa.animals.entity;

public class GatoEntity {
	
	  	private String nome;

	  	private String raça;

	  	private Integer idade;

	  	public String getNome() {
	        return nome;
	    }

	     public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getRaça() {
	        return raça;
	    }

	    public void setRaça(String raça) {
	        this.raça = raça;
	    }

	    public Integer getIdade() {
	        return idade;
	    }

	    public void setIdade(Integer idade) {
	        this.idade = idade;
	    }

		public GatoEntity(String nome, String raça, Integer idade) {
			super();
			this.nome = nome;
			this.raça = raça;
			this.idade = idade;
		}
	    
		public String comer(){
		        return "Come gatinho, come";
		}
		public String reinar(){
	        return "Saaaaaiiii daaaiiiii";
		}

		public String beber(){
		    return "Toma agua gatinho";
		}

		public void miar(){
		    System.out.println("MEEEEEAAAAWWWW");
		}
	    

}
