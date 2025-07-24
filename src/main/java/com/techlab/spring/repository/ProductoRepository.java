package com.techlab.spring.repository;

import com.techlab.spring.model.producto.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}