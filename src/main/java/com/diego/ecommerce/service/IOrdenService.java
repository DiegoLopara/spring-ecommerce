package com.diego.ecommerce.service;

import java.util.List;

import com.diego.ecommerce.model.Orden;

public interface IOrdenService {

	List<Orden> findAll();
	Orden save (Orden orden);
}
