package com.crosa.animals.entity;

public class RatoEntity {
	
	 private String nome;

	 private Integer idade;

	 private String raça;
	 
	 public String getNome() {
	      return nome;
	 }

	 public void setNome(String nome) {
	      this.nome = nome;
	 }

	 public Integer getIdade() {
	      return idade;
	 }

	 public void setIdade(Integer idade) {
	     this.idade = idade;
	 }

	 public String getRaça() {
	     return raça;
	 }

	 public void setRaça(String raça) {
	     this.raça = raça;
	 }

	 public RatoEntity(String nome, Integer idade, String raça) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raça = raça;
	 }

	 public String roer(){
	     return "Puts roeu minha bermuda";
	 }

	 public String nadar(){
	     return "Olha ele está nadando";
	 }

	 public String comer(){
	      return "Comeu a ração do luke ";
	 }

	 public void morrer(){
	      System.out.println("morreu o ratinho");
	 }
	    
}
