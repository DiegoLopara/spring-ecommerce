package com.diego.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.ecommerce.model.Orden;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

}
