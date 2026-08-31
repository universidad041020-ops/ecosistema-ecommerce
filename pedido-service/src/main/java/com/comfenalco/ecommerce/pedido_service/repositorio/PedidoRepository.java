package com.comfenalco.ecommerce.pedido_service.repositorio;

import com.comfenalco.ecommerce.pedido_service.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}