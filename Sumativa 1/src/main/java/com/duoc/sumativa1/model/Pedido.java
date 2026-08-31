package com.duoc.sumativa1.model;

public abstract class Pedido implements Despachable, Cancelable {
    protected int id;
    protected String direccion;
    protected double distanciaKm;
    protected String repartidor;
    protected boolean cancelado;
    protected boolean despachado;

    public Pedido(int id, String direccion, double distanciaKm) {
        this.id = id;
        this.direccion = direccion;
        this.distanciaKm = distanciaKm;
        this.repartidor = "Sin asignar";
        this.cancelado = false;
        this.despachado = false;
    }

    // Polimorfismo: Sobrecarga (Overloading)
    public void asignarRepartidor() {
        this.repartidor = "Repartidor Automático SpeedFast";
    }

    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
    }

    // Método Abstracto
    public abstract int calcularTiempoEntrega();

    // Método Concreto
    public void mostrarResumen() {
        System.out.println("Pedido #" + id);
        System.out.println("Dirección: " + direccion);
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Repartidor asignado: " + repartidor);
        System.out.println("Tiempo estimado: " + calcularTiempoEntrega() + " minutos");
    }

    @Override
    public void despachar() {
        if (!cancelado) {
            this.despachado = true;
            System.out.println("Pedido despachado correctamente.");
        } else {
            System.out.println("No se puede despachar un pedido cancelado.");
        }
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando " + getClass().getSimpleName() + " #" + id + "...");
        this.cancelado = true;
        System.out.println("→ Pedido cancelado exitosamente.");
    }

    // Getters
    public int getId() { return id; }
    public String getRepartidor() { return repartidor; }
    public boolean isDespachado() { return despachado; }
    public boolean isCancelado() { return cancelado; }
}