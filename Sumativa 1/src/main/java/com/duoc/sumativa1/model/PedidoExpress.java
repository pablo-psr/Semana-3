package com.duoc.sumativa1.model;

public class PedidoExpress extends Pedido {
    public PedidoExpress(int id, String direccion, double distanciaKm) {
        super(id, direccion, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return Math.max(10, (int)(distanciaKm * 3));
    }
}