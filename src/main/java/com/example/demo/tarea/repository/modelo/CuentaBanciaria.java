package com.example.demo.tarea.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBanciaria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cut")
	@SequenceGenerator(name = "seq_cut", sequenceName = "seq_cut", allocationSize = 1)
	
	@Column(name = "cuenta_id")
    private Integer id;
	@Column(name = "cuenta_numero")
	private String numero;
	@Column(name = "cuenta_tipo")
	private String tipo;
	@Column(name = "cuenta_saldo")
	private BigDecimal saldo;
	
	@OneToMany(mappedBy = "CuentaBanciaria", fetch = FetchType.LAZY)
	private List<Transferencia> transferencias;
	
	@ManyToOne()
	@JoinColumn(name = "cuenta_cedula_cliente")
	private Cliente cliente;
     
	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CuentaBanciaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo
				+ ", transferencias=" + transferencias + ", cliente=" + cliente + "]";
	}
	
	
}
