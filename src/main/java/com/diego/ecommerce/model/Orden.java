package com.diego.ecommerce.model;

import java.util.Date;

public class Orden {
	private Integer id;
	private String numero;
	private Date fechaCreación;
	private Date fechaRecibida;
	
	private double total;
	
	public Orden() {
	}

	public Orden(Integer id, String numero, Date fechaCreación, Date fechaRecibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreación = fechaCreación;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}

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

	public Date getFechaCreación() {
		return fechaCreación;
	}

	public void setFechaCreación(Date fechaCreación) {
		this.fechaCreación = fechaCreación;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreación=" + fechaCreación + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
	
}
