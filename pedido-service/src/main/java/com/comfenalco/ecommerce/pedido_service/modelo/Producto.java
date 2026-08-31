package com.comfenalco.ecommerce.pedido_service.modelo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Producto {
    private Long id;
    private String nombre;
    private BigDecimal precio;
    private Integer stock;
}