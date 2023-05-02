package com.crosa.animals.entity;

public class CachorroEntity {
	
	 	private String nome;

	    private String raça;

	    private Integer idade;

	    private Double peso;

	     
	    public CachorroEntity(String nome, String raça, Integer idade, Double peso) {
			super();
			this.nome = nome;
			this.raça = raça;
			this.idade = idade;
			this.peso = peso;
		}



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



	    public Double getPeso() {
	        return peso;
	    }



	    public void setPeso(Double peso) {
	        this.peso = peso;
	    }

	    
	    public String latir(){
	        return "cachorro latiu";
	    }

	    public String comer(){
	        return "cachorro comeu";
	    }

	    public String morder(){
	        return "Ai cachorro me mordeu";
	    }

	    public String dormir(){
	        return "Vai dormir";
	    }

	    public void mijar(){
	        System.out.println("ixi fez xixi aqui");
	    }
	
	

}


// MVC
// M => model - dado puro (cachorro- caracteristicas)
// V => view - parte de visualizar (o que apresenta pro usuario)
// C => controll - controle dos dados/ gerenciar/ administrador


// DAO
// D => data - representa os dados
// A => acess - acesso aos dados
// O => object - representação gerenica  dos dados