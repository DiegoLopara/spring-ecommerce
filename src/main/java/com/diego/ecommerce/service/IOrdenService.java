package com.diego.ecommerce.service;

import java.util.List;

import com.diego.ecommerce.model.Orden;
import com.diego.ecommerce.model.Usuario;

public interface IOrdenService {

	List<Orden> findAll();
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);
}
