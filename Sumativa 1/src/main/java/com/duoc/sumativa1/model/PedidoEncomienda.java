package com.duoc.sumativa1.model;

public class PedidoEncomienda extends Pedido {
    private double pesoKg;

    public PedidoEncomienda(int id, String direccion, double distanciaKm, double pesoKg) {
        super(id, direccion, distanciaKm);
        this.pesoKg = pesoKg;
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(distanciaKm * 4) + (int)(pesoKg * 2);
    }
}