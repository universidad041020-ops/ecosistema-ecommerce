package com.comfenalco.ecommerce.producto_service.repositorio;

import com.comfenalco.ecommerce.producto_service.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}