package com.duoc.sumativa1.model;

public class PedidoComida extends Pedido {
    private int tiempoPreparacionMin;

    public PedidoComida(int id, String direccion, double distanciaKm, int tiempoPreparacionMin) {
        super(id, direccion, distanciaKm);
        this.tiempoPreparacionMin = tiempoPreparacionMin;
    }

    @Override
    public int calcularTiempoEntrega() {
        return tiempoPreparacionMin + (int)(distanciaKm * 5);
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor de Comida Express";
    }
}