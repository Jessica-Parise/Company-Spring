package br.com.dh.company.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pedido {
	@Id
	private String nfe;
	private String dt_pedido;
	private double valor_total;
	private String status_pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente")
	@JsonIgnoreProperties({"pedidos", "fk_id_cliente"})
	private Cliente cliente;
	
	public Pedido () {}
	
	public Pedido(String nfe, String dt_pedido, double valor_total, String status_pedido, Cliente cliente) {
		super();
		this.nfe = nfe;
		this.dt_pedido = dt_pedido;
		this.valor_total = valor_total;
		this.status_pedido = status_pedido;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNfe() {
		return nfe;
	}

	public void setNfe(String nfe) {
		this.nfe = nfe;
	}

	public String getDt_pedido() {
		return dt_pedido;
	}

	public void setDt_pedido(String dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus_pedido() {
		return status_pedido;
	}

	public void setStatus_pedido(String status_pedido) {
		this.status_pedido = status_pedido;
	}
	
}
