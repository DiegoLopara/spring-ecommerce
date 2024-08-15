package com.diego.ecommerce.service;

import java.util.Optional;

import com.diego.ecommerce.model.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Integer id);
}
