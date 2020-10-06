package br.com.dh.company.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funcionario;
	private String nome;
	private String cpf;
	private String data_nasc;
	private String cargo;
	private String email;
	private double salario;
	private String senha;
	private int permissao;

	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String data_nasc, String cargo, String email, double salario,
			String senha, int permissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.cargo = cargo;
		this.email = email;
		this.salario = salario;
		this.senha = senha;
		this.permissao = permissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getPermissao() {
		return permissao;
	}

	public void setPermissao(int permissao) {
		this.permissao = permissao;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}