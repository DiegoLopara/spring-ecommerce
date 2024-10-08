package com.diego.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreación;
	private Date fechaRecibida;

	private double total;

	@ManyToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "orden")
	private List<DetalleOrden> detalle;

	public Orden() {
	}

	public Orden(Integer id, String numero, Date fechaCreación, Date fechaRecibida, double total, Usuario usuario,
			List<DetalleOrden> detalle) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreación = fechaCreación;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
		this.usuario = usuario;
		this.detalle = detalle;
	}

	// Getters and setters

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleOrden> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleOrden> detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreación=" + fechaCreación + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + ", usuario=" + usuario + ", detalle=" + detalle + "]";
	}
}
