package com.diego.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.ecommerce.model.DetalleOrden;
import com.diego.ecommerce.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
	}

}
