package br.com.portifolio.forDevs;

import java.io.Serializable;
import java.lang.reflect.Field;

public class People implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String data_nasc;
	private String signo;
	private String mae;
	private String pai;
	private String email;
	private String senha;
	private String cep;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone_fixo;
	private String celular;
	private String altura;
	private int peso;
	private String tipo_sanguineo;
	private String cor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataDeNascimento() {
		return data_nasc;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.data_nasc = dataDeNascimento;
	}
	public String getSigno() {
		return signo;
	}
	public void setSigno(String signo) {
		this.signo = signo;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone_fixo() {
		return telefone_fixo;
	}
	public void setTelefone_fixo(String telefone_fixo) {
		this.telefone_fixo = telefone_fixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}
	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public static String header(){
		String header = "";
		Field[] declaredFields = People.class.getDeclaredFields();	
		for (Field field : declaredFields) {
			if (!field.getName().equals("serialVersionUID")) {
				header = header + field.getName()+ "; ";				
			}
		}
		return header;
	}
	
	@Override
	public String toString() {
		return nome + "; " + idade + "; " + cpf + "; " + rg + "; "
				+ data_nasc + "; " + signo + "; " + mae + "; " + pai + "; " + email
				+ "; " + senha + "; " + cep + "; " + endereco + "; " + numero + "; "
				+ bairro + "; " + cidade + "; " + estado + "; " + telefone_fixo
				+ "; " + celular + "; " + altura + "; " + peso + "; "
				+ tipo_sanguineo + "; " + cor;
	}
	
	
	
	
	
}



























