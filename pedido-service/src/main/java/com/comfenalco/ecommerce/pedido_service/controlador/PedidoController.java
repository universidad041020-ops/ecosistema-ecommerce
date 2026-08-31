package com.comfenalco.ecommerce.pedido_service.controlador;

import com.comfenalco.ecommerce.pedido_service.modelo.Pedido;
import com.comfenalco.ecommerce.pedido_service.servicio.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @PostMapping
    public Pedido crear(@RequestParam Long productoId, @RequestParam Integer cantidad) {
        return service.crearPedido(productoId, cantidad);
    }
}