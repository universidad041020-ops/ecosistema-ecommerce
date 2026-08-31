package com.comfenalco.ecommerce.pedido_service.servicio;

import com.comfenalco.ecommerce.pedido_service.modelo.Pedido;
import com.comfenalco.ecommerce.pedido_service.modelo.Producto;
import com.comfenalco.ecommerce.pedido_service.repositorio.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final RestTemplate restTemplate;
    private final PedidoRepository repository;

    @Value("${producto-service.url}")
    private String productoServiceUrl;

    public Pedido crearPedido(Long productoId, Integer cantidad) {
        Producto producto = restTemplate.getForObject(
                productoServiceUrl + "/api/productos/" + productoId, Producto.class);

        if (producto == null) {
            throw new IllegalArgumentException("Producto no encontrado: " + productoId);
        }

        Pedido pedido = new Pedido(null, productoId, cantidad,
                producto.getPrecio().multiply(BigDecimal.valueOf(cantidad)), "CREADO");

        return repository.save(pedido);
    }
}